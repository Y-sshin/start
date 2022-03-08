package day10;
/*
	블핑 친구들의 정보를 기어시키고 출력
*/
public class Test02 {
	public Test02() {
		//제니객체
		Friend f1 = new Friend();
		//f1.name = "제니";//변수의 접근지정자가 private이므로
		//제니정보 세팅
		f1.setName("제니");
		f1.setAddr("ygM");
		f1.setBirth("1996/03/08");
		f1.setMail("jennie@githrd.com");
		f1.setTel("010-1111-1111");
		f1.setAge(27);
		f1.setGen('F');
		//출력
		System.out.println("제니의 이름:" + f1.getName());
		System.out.println("제니의 주소:" + f1.getAddr());
		System.out.println("제니의 생일:" + f1.getBirth());
		System.out.println("제니의 메일:" + f1.getMail());
		System.out.println("제니의 전화:" + f1.getTel());
		System.out.println("제니의 나이:" + f1.getAge());
		System.out.println("제니의 성별:" + f1.getGen());
		//로제
		Friend f2 = new Friend();
		f2.setName("로제");
		//리사
		Friend f3 = new Friend();
		//지수
		Friend f4 = new Friend();
		//네 멤버를 하나의 변수로 관리
		Friend[] black = new Friend[4];	//이렇게 하면 Friend타입의 데이터를 기억할 공간 4개를 확보한 상태,
										//아직 각 공간에는 아무런 데이터가 드렁있지 않다.
		
		Friend tmp1 = black[0];
		
		//System.out.print("name :"+tmp1.getName()); <- 아직 Friend의 객체가 각 방에 채워지지 않았음,
		//따라서 멤버함수를 호출 할 수 없다.
		
		//위에서 만든 Friend 객체를 순서대로 배열에 채워준다.
		black[0] = f1;
		black[1] = f2;
		black[2] = f3;
		black[3] = f4;
	}

	public static void main(String[] args) {
		new Test02();
	}

}
