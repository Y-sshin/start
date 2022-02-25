package day03.ex;
/*
 		1년은 365.2426일이다.
	이것은 과연 몇일 몇시간 몇분 몇초인지 계산하고 출력하세요.
	
	힌트
		365.2426일은 단위가 일 단위이다.
		하루는 24이간이다.
		따라서 0.5일은 12시간을 의미한다.
 */
public class ex04_1 {
	public static void main(String[] args){
		double total = 365.2426;//데이터를 변수에 기억
		double tmp = total;
		int day = (int)tmp;
		tmp = tmp-day;//tmp-=day; 로 작성해도 무방
		int tsec = (int)(tmp*24*60*60);//0.2426을 초로 변환
		int hour = tsec/3600;//tsec/60/60; 도 무방
		tsec = tsec%3600;//tsec%=3600; 도 무방
		tsec = tsec%(60*60);
		int min = tsec/60;
		tsec = tsec %60;
		int sec = tsec;
		System.out.println("1년은 " + total + "일이고");
		System.out.println("이것은 " + day + "일");
		System.out.println("  " + hour + "시간");
		System.out.println("  " + min + "분");
		System.out.println("  " + sec + "초 이다.");
		
		
	}
}
