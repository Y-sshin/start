package day06.ex;
/*
 	두 사람이 등산을 함, 한 명은 산 입구에서 등산을 시작하고, 다른 한 사람은 정상에서 내려온다.
 	올라가는 사람은 0.54m/s의 속도로, 내려가는 사람은 1.07m/s의 속도로 내려온다
 	산의 높이가 7564m라고 가정하면, 
 	두 사람이 만나는 시점은 몇 분 몇 초 후인가?(올라가는 사람이 내려오는 사람보다 높아지는 최초 시점을 찾기)
 */
public class ex02 {
	public static void main(String[] args) {
		double up =0.0;
		double down =7564.0;
		for(int i = 1 ; ; i++) {
			up += 0.54;
			down -= 1.07;
			if(up>down) {
				int hour = 0;
				int minute = 0;
				int second = 0;
				hour = i/3600;
				minute = i%3600/60;
				second = i%60;
				System.out.println(hour+"시간"+minute+"분"+second+"초 이후에");
				break;
			}
		}
	}
}

