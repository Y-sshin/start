package day11;

public class Test00_03 {
	Nemo[] sagak;
	public Test00_03() {
		setSagak();//배열세팅
		setRank();//순위결정
		toPrint();//출력함수
	}
	//배열세팅함수
	public void setSagak() {
		sagak = new Nemo[5];
		for(int i = 0 ; i < sagak.length ; i++) {
			sagak[i] = new Nemo((int)(Math.random()* 21 +5),(int)(Math.random()* 21 +5));
		}
	}
	//순위결정함수
	public void setRank() {
		for(int i = 0 ; i < sagak.length ; i++) {//할일, 각 네모를 꺼내고, 각 네모의 순위를 꺼내고, 다른네모들과 비교후 +1
			Nemo n = sagak[i];
			int me = n.getArea();
			for(int j = 0 ; j < sagak.length ; j++) {
				int na = n.getRank();
				int you = sagak[j].getArea();
				if(me<you) {
					n.setRank(n.getRank()+1);//(na+1)과 같음
				}
			}
		}
	}
	/*
		네모 순위별로 정렬하여 기억시키고 출력
	*/
	//출력함수
	public void toPrint() {
		for(int i = 0 ; i < 5 ; i++) {//출력
			Nemo n =sagak[i];
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			int rank = n.getRank();			
			System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 넓이는 %4d 이고 %2d 번째 큰 사각형", garo, sero, area, rank);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Test00_03();
	}

}
