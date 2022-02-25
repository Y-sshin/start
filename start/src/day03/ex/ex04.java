package day03.ex;
/*
	1년은 365.2426일이다.
	이것은 과연 몇일 몇시간 몇분 몇초인지 계산하고 출력하세요.
	
	힌트
		365.2426일은 단위가 일 단위이다.
		하루는 24이간이다.
		따라서 0.5일은 12시간을 의미한다.
 */
public class ex04 {
	public static void main(String[] args) {
		double tmp   = 365.2426;
		int day      = (int)tmp/1;
		       tmp   =      tmp%1;
		       tmp   =      tmp*24;
		int time     = (int)tmp/1;
		       tmp   =      tmp%1;
		       tmp   =      tmp*60;
		int minute   = (int)tmp/1;
			   tmp   =      tmp%1;
			   tmp   =      tmp*60;
		int second   = (int)tmp/1;
		System.out.println(day + "일, " + time + "시간, " + minute + "분, " + second +"초.");
	}
}
