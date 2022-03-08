package day10;
/*
	blackpink 멤버의 정보를 기억할 배열을 만들고 데이터를 입력하고 완성되면 내용을 출력 단,
	각 멤버의 정보는 Friend 클래스에 기억시키도록 한다.
*/
public class Test03 {
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int[] naee;
	char gen;
	String addrs;
	
	public Test03() {
		//멤버변수들 초기화
		setData();
		//필요한데이터들이 준비된 상태
		//각 멤버를 배열 하나로 관리
		Friend[] black = getBlack();
		//내용출력
		for(Friend f : black) {
			System.out.println(f);//이렇게 하면 Friend클래스에 재정의한 toString()함수가 자동 호출
		}
		
		//다시출력
		toPrint(black);
	}
	
	//friend 배열 내용 출력해주는 함수
	public void toPrint(Friend[] b) {
		for(int i = 0 ; i < b.length ; i++) {
			String name = b[i].getName();	//이때 배열의 각 방에 기억된 객체들의 멤버변수는 접근이 불가능하므로,
											//그나마 점근 가능한 함수를 호출하여 처리해야 한다.
			String addr = b[i].getAddr();
			String tel = b[i].getTel();
			String mail = b[i].getMail();
			String birth = b[i].getMail();
			int age = b[i].getAge();
			char gen = b[i].getGen();
			
			System.out.println("이름 : "+name);
			System.out.println("주소 : "+addr);
			System.out.println("전화 : "+tel);
			System.out.println("메일 : "+mail);
			System.out.println("생일 : "+birth);
			System.out.println("나이 : "+age);
			System.out.println("성별 : "+gen);
			System.out.println("---------------");
		}
	}
	
	
	//준비된 데이터를 Friend배열 타입에 데이터로 만들어서 반환해주는 함수
	public Friend[] getBlack() {
		Friend[] anne = new Friend[4];//이 함수는 Friend[]배열을 만들고 데이터를 채워서 채원채 배열을 반환해준다.
		for(int i = 0 ; i < 4 ; i++){//각 방에 Friend 객체들을 채워 넣는다.
			anne[i] = new Friend();//4명분의 데이터가 입력 되어야 하므로 Friend객체를 4개를 만들어 각 방에 집어 넣는다.
		}//위 반복문이 종료되면 각 방에있는 객체의 변수에 데이터를 입력할 수 있는 상태가 된다.
		for(int i = 0 ; i < anne.length ; i++) {
			Friend f = anne[i];
			String name = names[i];
			f.setName(name);
			f.setAddr(addrs);
			f.setTel(tels[i]);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setGen(gen);
		}
		return anne;
	}
	
	
	//각 데이터를 초기화 시켜주는 함수
	public void setData() {
		names = new String[] {"제니","리사","로제","지수"};
		tels = new String[] {"010-1111-1111","010-2222-2222","010-3333-3333","010-1234-5678"};
		email = new String[] {
				"jennie@githrd.com","Lisa@githrd.com","rose@githrd.com","jisoo@githrd.com"
		};
		birthday = new String[] {
				"1996/03/08","1996/04/05","1998/05/05","1997/07/07"
		};
		naee = new int[] {27,28,26,27};
		gen = 'F';
		addrs = "ygM";
	}
	
	
	public static void main(String[] args) {
		new Test03();
	}

}
