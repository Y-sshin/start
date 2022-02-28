package day05;
//1부터숫자를 만들어서 출력하고 50이 되면 반복을 종료
public class Test09 {
	/*
	 	참고-for명령문에 증감식, 조건식, 카운터변수선언 초기화
	 	부분은 모두 기술하지 않아도 무방하다.
	 	이때 무한반복으로 처리된다. 세미콜론은 반드시 써 두도록 하자
	 	이때 반복문 내에서 종료시점을 조건문으로 기술해야 한다.(break)
	 */
	public static void main(String[] args) {
		for(int i = 0 ;  ; i++) {
			int no = i+1;//참고- for명령에서 아무것도 기술하지 않는 경우는 조건식의 결과를 true로 실행하게 된다.
			if(no>50) {
				break;
			}
			System.out.print(no + ",");
		}
		System.out.println();
		
		int no = 1;
		while(true) {
			if(no>50) {
				break;
				
			}
			System.out.print(no + ",");		
			no +=1;
		}
	}
}
