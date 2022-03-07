package day06.ex;
/*
 	*****
 	*****
 	*****
 	*****
 	*****
 	출력
 	*****
 	****
 	***
 	**
 	*
 	출력
 	    *
 	   **
 	  ***
 	 ****
 	*****
 	출력
 	  *
 	 ***
 	*****
 	출력
 */
public class ex04 {
	public static void main(String[] args) {
		
		System.out.println("첫번째");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("두번째");
		for(int i = 0 ; i < 5 ; i++) {
			for(int j = 0 ; j < 5-i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		System.out.println("세번째1");
		for(int i = 0 ; i < 6 ; i++) {
			for(int j = 0 ; j < 6 ; j++) {
				if(j>=6-i) {
					System.out.print("*");					
				}else {					
					System.out.print(" ");					
				}
			}
			System.out.println();
		}


		System.out.println("세번째2");
		for(int i = 5 ; i >= 1 ; i=i-1) {
			for(int j = 1 ; j <= 5 ; j++) {
				if(j<i) {					
					System.out.print(" ");
				}else {
					System.out.print("*");					
				}
			}
			System.out.println();
		}
		
		System.out.println("네번째");
		for(double i = 1 ; i >=0.3 ; i=i*0.5 ) {
			for(double j = -2*i ; j <= 2*i ; j ++) {
				if(j>-1&&j<1) {
					System.out.print("*");              // <-해결못함
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}




	}
}