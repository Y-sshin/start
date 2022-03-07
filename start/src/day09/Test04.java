package day09;
/*
	5학생의 3과목에 대한 점수를 배열에 입력한 후
	총점을 구하는 프로그램을 작성하세요
	단 점수입력, 계산, 출력은 함수로 처리하세요
*/
public class Test04 {
	
	//실행내용
	public Test04() {
		int[][] stud = new int[5][4];
		//점수구함
		setArr(stud);
		for(int i = 0 ; i < stud.length ; i++) {
			int[] no = stud[i];
			setTotal(no);
		}
		//내용 출력
		toPrint(stud);
	}
	
	//메인 진입점함수
	public static void main(String[] args) {
		new Test04();
	}
	
	//배열을 입력해서 실행하면 점수를 채워주는 함수
	public void setArr(int[][] m1) {
		for(int i = 0 ; i < m1.length ; i++) {
			//학생 수 만큼 반복
			for(int j = 0 ; j < m1[i].length-1 ; j++) {
				m1[i][j] = (int)(Math.random()*41+60);//과목 점수 만들고
			}
		}
		//이 함수의 경우는 입력된 주소의 내용을 변경하는 것이므로 반환값이 없다. 
	}
	
	//배열을 입력하면 총점을 계산해서 셋팅하느 ㄴ함수
	public void setTotal(int[] m2) {
		int sum = 0;//입력된 점수를 누적해서 더해주고
		for(int i = 0 ; i < m2.length ; i++){//총점방에 누적된 점수를 입력
			sum +=m2[i];
		}
		m2[m2.length-1] = sum;
	}
	
	//출력하는 함수
	public void toPrint(int[][] m3) {
		for(int i = 0 ; i < m3.length ; i++) {
			//한 학생의 점수를 뽑
			System.out.print((char)('A'+i)+"학생 :");
			for(int j = 0 ; j < m3[i].length ; j++) {
				System.out.printf("%4d",m3[i][j]);
			}
			System.out.println();
			//각 과목점수 뽑
		}
	}
}




