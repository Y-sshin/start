package day08;
/*
	블핑맴버들의 이름을 기억할 배열을 만들고 이름을 입력해서 출력
*/
import java.util.*;
public class Test06 {

	public static void main(String[] args) {
		String[] blackpink ;
		//System.out.println(Arrays.toString(blackpink));  //이때 아무것도 없겠지?
		blackpink = new String[4];//이름을 기억할 배열//이때 데이터를 기억할 공간만 확보한 상태
		blackpink[0] = "제니";//이름을 입력
		blackpink[1] = "리사";//이름을 입력
		blackpink[2] = "로제";//이름을 입력
		blackpink[3] = "지수";//이름을 입력
		for(int i = 0 ; i < blackpink.length ; i++){//출력
			System.out.println(blackpink[i]);
		}
	}

}
