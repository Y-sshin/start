package day11;

public class Test00_01 {
	public Test00_01() {
		Nemo[] sagak = new Nemo[5];
		//만들어진 배열에 사각형 채워주는 함수
		setArr(sagak);
		toPrint(sagak);//출력
	}
	
	//넘겨받은 배열에 사각형 채워주는 함수
	public void setArr(Nemo[] sagak) {//할일
		for(int i = 0 ; i < sagak.length ; i++) {//건네받은 배열의 길이만큼 먼저 네모객체 채워줌
			sagak[i] = new Nemo((int)(Math.random()* 21 +5),(int)(Math.random()* 21 +5));
		}
	}
	public void toPrint(Nemo[] sagak) {
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
		new Test00_01();
	}

}
