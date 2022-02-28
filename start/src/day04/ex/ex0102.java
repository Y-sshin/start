package day04.ex;

public class ex0102 {
	public static void main(String[] args){
	int no1 = (int)(Math.random()*(25-1+1)+1);//랜덤정수발생
	int no2 = (int)(Math.random()*(25-1+1)+1);
	int no3 = (int)(Math.random()*(25-1+1)+1);
	
	int maximum = (no1>no2)?(
			
			(no1>no3)?(no1):(no3)
			
			
			):(
					(no2>no3)?(no2):(no3)
					
					);
			
	int middle = (no1==no2)?(
					
			(no2>no3)?(no2):(no2)
					
					
			):(
					(no2==no3)?(no2):((no1==no3)?(no3):((no1>no2)?((no2>no3)?(no2):(no3)):((no1>no3)?(no1):(no3))))
							
					);
			
	int minimum = (no1>no2)?(
					
			(no2>no3)?(no3):(no2)
							
							
			):(
					(no1>no3)?(no3):(no1)
									
					);
			
			System.out.println(no1+", " +no2+", "+ no3);
			System.out.println("가장 큰 수는 [" + maximum + "] 이고,"+" 중간 수는 ["+middle+"] 가장 작은 수는 [" + minimum + "]입니다." );
	//주의할 점: 랜덤숫자가 22,8,8이 발생한 경우 "큰수22, 중간수 22, 작은수 8" 로 출력된다. 동수에 대한 경우가 없음
	}
}


