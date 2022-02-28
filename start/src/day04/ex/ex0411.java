package day04.ex;

public class ex0411 {
	public static void main(String[] args) {
		int years = (int)(Math.random() * (3000-1000+1)+1);
		if(years%400==0) {
			System.out.println("생성된 " + years + "년은 윤년입니다.");
		}else if(years%100==0) {
			System.out.println("생성된 " + years + "년은 평년입니다.");			
		}else if(years%4==0){
			System.out.println("생성된 " + years + "년은 윤년입니다.");						
		}else {			
			System.out.println("생성된 " + years + "년은 평년입니다.");						
		}
	}

}
