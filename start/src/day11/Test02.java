package day11;

public class Test02 {
	public Test02() {
		for(int i = 0 ; i < 5 ; i++) {			
			Won c1 = new Won((int)(Math.random()*21+5));//원 하나 만듬
			int rad = c1.getRad();//c1의 둘레계
			//double arround = rad * 2 * Won.PI;
			//double area = rad * rad * Won.PI;
			//c1.setArround(arround);
			//c1.setArea(area);
			//System.out.printf("반지름이 %3d 이고 둘레가 %5.2f 이고 넓이다 %5.2f 인 동그라미", rad, arround, area);//출력
		}
	}
	public static void main(String[] args) {
		new Test02();
	}

}
