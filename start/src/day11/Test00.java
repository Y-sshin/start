package day11;

public class Test00 {
	public Test00() {
		Nemo[] sagak = new Nemo[5];//네모객체다섯개를 기억할 배열
		for(int i = 0 ; i < 5 ; i++){//각 방에 객체를 만들어서 패워준다.
			int garo = (int)(Math.random()* 21 +5);//가로세로 만들기
			int sero = (int)(Math.random()* 21 +5);//가로세로 만들기
			Nemo n = new Nemo(garo,sero);
			sagak[i] = n;//배열에 만들어진 네모 채우고
		}
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
		new Test00();
	}

}
