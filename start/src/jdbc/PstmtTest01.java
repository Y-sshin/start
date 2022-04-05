package jdbc;
import java.util.*;
import java.sql.*;
/*
	이 클래스는 오라클에 있는 emp table에서 부서번호가 ??번인 사원들의 정보를 조회해서 출력해주는 기능을 가진 클래스
	따라서 이 클래스는 객체가 되는 순간 데이터베이스에 연결할 준비가 되어있어야 한다.
		드라이버 로디이 끝난 상태여야 한다는 뜻
 */
public class PstmtTest01 {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public PstmtTest01() {
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 부서번호 입력");
		int dno = sc.nextInt();
		try {
			//작업순서
			//1.드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.커넥션 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "tiger";
			con = DriverManager.getConnection(url, user, password);
				//이 명령이 정상적으로 ㅅ길행되면 오라클에서 세션 하나를 확보한 상태
			
			//3.질의명령 준비
			StringBuffer buff = new StringBuffer();
			buff.append("SELECT ");
			buff.append("	empno eno, ename, job, mgr, TO_CHAR(hiredate, 'YYYY/MM/dd') hdate, deptno dno ");
			buff.append("FROM ");
			buff.append("	emp ");
			buff.append("WHERE ");
			buff.append("	deptno = ? ");
			
			String sql = buff.toString();
			//4.명령을 전달할 도구준비
			/*
				Statement
					프로그램에서 JDBC로 명령을 전달하는 도구
					이때 사용해야 되는 질의 명령은 완벽한 질의명령이어야 한다.
					위 경우는 매번 부서번호를 정해서 바꿔야 하는 불완전한 질의 명령이다.
					이럴때 사용하는 명령전달도구로 PreparedStatement가 있다.
			 */
			pstmt = con.prepareStatement(sql);
			//명령전달도구는 준비되었지만 도구 안에 세팅된 질의명령은 완전하지 않다. 따라서 질의명령을 완벽하게 해줘야 한다.
			//그 방법은 물음표에 정확한 데이터를 채워주면 된다.
			/*
				불완전한 질의명령에 데이터를 채우는 방법 (물음표가 있는 질의명령)
					문자열인 경우
						SetString(위치값, 데이터);
					정수인(int) 경우
						SetInt(위치값, 데이터);
				이때 위치값은은 문자열 중에서 물음표의 순서를 의미하고
				시작값은 1부터임. (??)db명령이라서 ??
			 */
			pstmt.setInt(1, dno);
			//질의명령이 완성댓으니깐  JBDC에게 전달하고 결과를 받아라
			rs = pstmt.executeQuery();//리절트셋이 인라인뷰를 기억하는 변수, 관리하는 클래스
			//몇 사람이 조회될지 알 수 없음
			while(rs.next()) {
				//rs.next() <- 작업실행줄을 한 줄 내려주는 함수, 이때 내린결과가 꺼내올 데이터가 있으면 트루를 반환해줌
				// 없으면 false
				
				//각사원의데이터 꺼냄
				int eno = rs.getInt("eno");
				String ename = rs.getString("ename");
				String job = rs.getNString("job");
				int mgr = rs.getInt("mgr");
				String hdate = rs.getString("hdate");
				dno = rs.getInt("dno");
				//출력
				System.out.printf("%5d - %15s - %10s - %5d - %10s - %4d\n", eno, ename, job, mgr, hdate, dno);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
				
			}catch(Exception e){}
		}
		
	}

	public static void main(String[] args) {
		new PstmtTest01();
	}

}
