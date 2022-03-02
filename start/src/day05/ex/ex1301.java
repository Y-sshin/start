package day05.ex;

/*
	문제 13 ]
		랜덤한 두 수를 입력한 후
		두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
		
		최대 공약수 :
			두 수의 약수중 제일 큰 수.
			두 수를 나눌 수 있는 수중 제일 큰 수
			
		extra ]
			위 문제가 해결되면 최소공배수를 구하는 문제로 풀어보세요.
 */
public class ex1301 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random() * 100+1);
		int no2 = (int)(Math.random() * 100+1);
		for(int i = 0 ; ; i++) {
			for(int j = 0 ; ; j++) {
				if(no1*(i+1)==no2*(j+1)) {
					System.out.println(no1+"과(와)"+no2+"의 최소 공배수는"+no1*(i+1)+"이고 이것은 no1값("+no1+")을 ("+(i+1)+"번, "+no2+"을 ("+(j+1)+"번 곱한 값이다.");
					break;
				}
			}
		}
	}

}
