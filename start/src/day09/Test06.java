package day09;

public class Test06 {
	int num;
	public Test06() {
		num = setNum();
	}
	public static void main(String[] args) {
		new Test06();

	}
	public int setNum() {
		int no = (int)(Math.random()*10+1);
		num = no;
		return no;//반환값이 없어도 됨
	}

}
