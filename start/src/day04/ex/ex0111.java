package day04.ex;


public class ex0111 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random()*(25-1+1)+1);//랜덤정수발생
		int no2 = (int)(Math.random()*(25-1+1)+1);
		int no3 = (int)(Math.random()*(25-1+1)+1);
		
		System.out.println("생성된 세 변수는 각각 " + no1 + ", " + no2 + ", " + no3 + " 이다.");
		if(no1==no2 & no2==no3) {
			System.out.println("세 수가 모두 같다.");
		}else if(no1==no2) {
			if(no1>no3) {
				System.out.println(no1 + "과 " + no2 + "가 서로 같고, 큰 수는" + no1 + "이고, 작은수는 " + no3 + "이다.");
			}else {
				System.out.println(no1 + "과 " + no2 + "가 서로 같고, 큰 수는" + no3 + "이고, 작은수는 " + no1 + "이다.");				
			}
		}else if(no1==no3) {
			if(no1>no2) {
				System.out.println(no1 + "과 " + no3 + "가 서로 같고, 큰 수는" + no1 + "이고, 작은수는 " + no2 + "이다.");
			}else {
				System.out.println(no1 + "과 " + no3 + "가 서로 같고, 큰 수는" + no2 + "이고, 작은수는 " + no1 + "이다.");				
			}
		}else if(no2==no3) {
			if(no1>no2) {
				System.out.println(no2 + "과 " + no3 + "가 서로 같고, 큰 수는" + no1 + "이고, 작은수는 " + no2 + "이다.");
			}else {
				System.out.println(no2 + "과 " + no3 + "가 서로 같고, 큰 수는" + no2 + "이고, 작은수는 " + no1 + "이다.");				
			}
		}else {//모두 다름
			if(no1>no2) {
				if(no1>no3) {
					if(no2>no3) {
						System.out.println("가장 큰 수는" + no1 + "이고 가장 작은 수는" + no3);
					}else {
						System.out.println("가장 큰 수는" + no1 + "이고 가장 작은 수는" + no2);						
					}
				}else {
					System.out.println("가장 큰 수는" + no3 + "이고 가장 작은 수는" + no2);
				}
			}else {// 2>1
				if(no2>no3) {
					if(no1>no3) {
						System.out.println("가장 큰 수는" + no2 + "이고 가장 작은 수는" + no3);
					}else {
						System.out.println("가장 큰 수는" + no2 + "이고 가장 작은 수는" + no1);
					}
				}else {
					System.out.println("가장 큰 수는" + no3 + "이고 가장 작은 수는" + no1);
				}
			}
		}
	}

}
