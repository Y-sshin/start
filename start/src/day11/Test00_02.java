package day11;

public class Test00_02 {
	Nemo[] sagak;
	
	public Test00_02() {
		//sagak변수에 네모 배열을 만들어서 네모 객체가 채워지도록.
		setSagak();
		toPrint();
	}
	
	public void setSagak(){//sagak셋팅해주는함수
		sagak = new Nemo[5];//배열 만들기
		
		for(int i = 0 ; i < sagak.length ; i++) {//건네받은 배열의 길이만큼 먼저 네모객체 채워줌
			sagak[i] = new Nemo((int)(Math.random()* 21 +5),(int)(Math.random()* 21 +5));
		}
	}
	
	public void toPrint() {//출력
		//이함수는 sagak변수에 기억된 배열에 접근해서 배열안에 기억된 네모 객체를 하나씩 꺼내서 그 객체의 정보를 출력하는 함수
		for(int i = 0 ; i < 5 ; i++) {//출력
			Nemo n =sagak[i];
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 넓이는 %4d 입니다.", garo, sero, area);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Test00_02();
	}

}
