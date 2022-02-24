package day03.ex;
/*
	84232원을 지불하려고 한다.
	우리나가 화폐단위별로 이 금액을 지불하려면 각 단위가 몇개 필요한지 계산하여 출력하세요
	화폐단위 5만원 만원 5천원 천원 5백원 백원 5십원 십원 1원
 */
public class ex03 {
		public static void main(String[] args) {
			int don1   = 84232;
			int m5Man  = don1/50000;
			int don2   = don1%50000;
			int m1Man  = don2/10000;
			int don3   = don2%10000;
			int m5Chun = don3/5000;
			int don4   = don3%5000;
			int m1Chun = don4/1000;
			int don5   = don4%1000;
			int m5Bek  = don5/500;
			int don6   = don5%500;
			int m1Bek  = don6/100;
			int don7   = don6%100;
			int m5Sip  = don7/50;
			int don8   = don7%50;
			int m1Sip  = don8/10;
			int don9   = don8%10;
			int m1Won  = don9/1;
			int don10  = don9%1;
			System.out.println("돈 세는중...");
			System.out.println("전체금액 " + don1 + "나누기 50000 의 몫은 " + m5Man  + "이므로 5만원권은 " + m5Man  + "장이고\n" + "그것을 제외하고 남은 금액은" + don2);
			System.out.println("남은금액 " + don2 + "나누기 10000 의 몫은 " + m1Man  + "이므로 1만원권은 " + m1Man  + "장이고\n" + "그것을 제외하고 남은 금액은" + don3);
			System.out.println("남은금액 " + don3 + "나누기 5000  의 몫은 " + m5Chun + "이므로 5천원권은 " + m5Chun + "장이고\n" + "그것을 제외하고 남은 금액은" + don4);
			System.out.println("남은금액 " + don4 + "나누기 1000  의 몫은 " + m1Chun + "이므로 5천원권은 " + m1Chun + "장이고\n" + "그것을 제외하고 남은 금액은" + don5);
			System.out.println("남은금액 " + don5 + "나누기 500   의 몫은 " + m5Bek + "이므로 5백원동전은 " + m5Bek + "개 고\n" + "그것을 제외하고 남은 금액은" + don6);
			System.out.println("남은금액 " + don6 + "나누기 100   의 몫은 " + m1Bek + "이므로  백원동전은 " + m1Bek + "개 고\n" + "그것을 제외하고 남은 금액은" + don7);
			System.out.println("남은금액 " + don7 + "나누기 50   의 몫은 " + m5Sip + "이므로  5십원동전은 " + m5Sip + "개 고\n" + "그것을 제외하고 남은 금액은" + don8);
			System.out.println("남은금액 " + don8 + "나누기 10   의 몫은 " + m1Sip + "이므로  십원동전은 " + m1Sip + "개 고\n" + "그것을 제외하고 남은 금액은" + don9);
			System.out.print  ("남은금액 " + don9 + "나누기 1   의 몫은 " + m1Won + "이므로  1원동전은 " + m1Won + "개 고\n" + "그것을 제외하고 남은 금액은" + don10);
			System.out.println(" 이다.");
			System.out.print("전체 화폐의 갯수는 5만원권 :" + m5Man + "장,\n 1만원권 : " + m1Man + "장,\n 5천원권 : " + m5Chun +"장,\n 1천원권 : " + m1Chun + "장,\n 5백원 동전 : " + m5Bek +"개,\n  백원 동전 : " + m1Bek + "개,\n 5십원 동전 : " + m5Sip + "개,\n  십원 동전 : " + m1Sip + "개,\n 1원 동전 : " + m1Won + "개 입니다.");                                  
			
			
			
		}
}
