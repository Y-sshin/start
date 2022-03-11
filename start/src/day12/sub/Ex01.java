package day12.sub;

/*
	랜덤하게 3 ~ 5 정수를 발생시켜서
		3 이 나오면 삼각형
		4 가 나오면 사각형
		5 가 나오면 원
	의 형태로 10의 도형을 만들어서 
	하나의 변수로 관리하고
	각 도형의 내용을 출력하세요.
 */
public class Ex01 {
	private Figure[] f1;
	public Ex01() {
		this(10);
	}
	public Ex01(int no) {
		f1 = new Figure[no];
		setFigure();
		toPrint();
	}
	
	public void setFigure(){
		int num = 0;
		for(int i = 0 ; i < f1.length ; i++) {
			num = (int)( Math.random() * 3 + 3 );
			switch(num) {
			case 3:
				f1[i] = new Semo((int)(Math.random()*6+5),(int)(Math.random()*6+5));
				break;
			case 4:
				f1[i] = new Nemo((int)(Math.random()*6+5),(int)(Math.random()*6+5));
				break;
			case 5:
				f1[i] = new Won((int)(Math.random()*6+5));
				break;
			}
		}
	}
	
	public void toPrint() {
		for(int i = 0 ; i < f1.length ; i++) {
			System.out.println((i+1)+"번째 도형의 정보");
			f1[i].toPrint();
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
