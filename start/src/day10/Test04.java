package day10;

public class Test04 {
	//변수선언
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int[] naee;
	char gen;
	String addrs;
	Friend[] black;
	
	
	public Test04() {
		//데이터 변수들 세팅하고
		setData();
		//배열 완성하고
		setBlack();
		//출력
		toPrint();
	}
	public void setBlack() {
		black = new Friend[4];//데이터기억할 공간확보
		//확보될 공간에 데이터 채움
		for(int i = 0 ; i < black.length ; i++) {
			black[i] = new Friend();
		}
		//각 방의 객체에 데이터 채워주기
		for(int i = 0 ; i < black.length ; i++) {
			Friend f = black[i];
			
			f.setName(names[i]);
			f.setTel(tels[i]);
			f.setAddr(addrs);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setGen(gen);
			f.setAge(naee[i]);
			
		}
	}
	
		public void setData() {//각 데이터를 초기화 시켜주는 함수
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
		
		//friend 배열 내용 출력해주는 함수
		public void toPrint() {
			// 이 함수가 호출되면 전역변수 black의 내용을 출력할 일이 있을 대이므로
			//별도로 데이터를 입력받지 않아도 배열에 접근가능하다
			for(int i = 0 ; i < black.length ; i++) {
				String name = black[i].getName();	//이때 배열의 각방에 기억된 객체들의 멤버변수는 접근이 불가능하므로,
													//그나나마 점근 가능한 함수를 호출하여 처리해야 한다.
				String addr = black[i].getAddr();
				String tel = black[i].getTel();
				String mail = black[i].getMail();
				String birth = black[i].getMail();
				int age = black[i].getAge();
				char gen = black[i].getGen();
				
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
		
	public static void main(String[] args) {
		new Test04();
	}

}
