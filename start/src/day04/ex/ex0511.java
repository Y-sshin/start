package day04.ex;

public class ex0511 {
	public static void main(String[] args) {
		System.out.println("3자리 숫자 임의생성");
		int no = (int)(Math.random() * (999-100+1)+1);
		System.out.println("생성된 세자리 숫자는" + no + "입니다.");		
		int thr = (no/100)*100;
		if(no%100==50) {
			System.out.print("가장 가까운 백의자리 수는 두개이며, 50의 수를 더하거나 빼서 구할 수 있습니다.");
		}else if(no%100<50){
			System.out.print("가장 가까운 백의자리 수는 " + thr + "이며, " + no%100 + "를 빼서 구합니다.");			
		}else {
			System.out.print("가장 가까운 백의자리 수는 " + (thr+100) + "이며, " + ((thr+100)-(no%100)) + "를 더해서 구합니다.");						
		}
	}

}
