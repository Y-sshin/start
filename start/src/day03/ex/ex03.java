package day03.ex;
/*
	84232원을 지불하려고 한다.
	우리나가 화폐단위별로 이 금액을 지불하려면 각 단위가 몇개 필요한지 계산하여 출력하세요
	화폐단위 5만원 만원 5천원 천원 5백원 백원 5십원 십원 1원
 */
public class ex03 {
		public static void main(String[] args) {
		int won = 84232;
		int fiveMan = 50000; int man = 10000; int fiveChun = 5000; int chun = 1000;
		int fiveBeak = 500; int beak = 100; int fiveTen = 50; int ten = 10;
		System.out.print("임의의 돈 "+won+"원은 5만원권 :"+won/fiveMan+"장, 만원권 :"+won%fiveMan/man+"장, 오천원권 :"
		+won%man/fiveChun+"장, 천원권 :"+won%fiveChun/chun+"장, 오백원동전 :"+won%chun/fiveBeak+"개, 백원동전 :"
		+won%fiveBeak/beak+"개, 오십원동전 :"+won%beak/fiveTen+"개, 십원동전 :"+won%fiveTen/ten+"개, 일원동전 :"
		+won%ten );
		}
}
