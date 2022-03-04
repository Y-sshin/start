package day07;
import java.util.*;
public class Test01 {
	public static void main(String[] args) {
		//정수 6개를 관리할 배열 arr을 만들고 1 부터 6까지 채워서 한개씩 꺼내서 출력하세요
		int[] arr;
		//배열변수 초기화
		arr = new int [6];
		// 참고[ 배열의 길이를 알아내는 방법: 배열.length
		// 출력
		int len = arr.length;
		for(int i = 0 ; i < len ; i++) {
			//배열에 기억된 데이터 꺼내는 방법 : 배열변수[위치값]
			int no = arr[i];
			
			System.out.println(no);
		}
		String[] blackpink = new String[4];
		//출력
		for(int i = 0 ; i < blackpink.length ; i++) {
			// int len = blackpink.length
			System.out.println(blackpink[i]);
		}
		//멤버이름 추가
				blackpink[0]="제니";
				blackpink[1]="리사";
				blackpink[2]="로제";
				blackpink[3]="지수";
		//출력
				System.out.println(blackpink);
				System.out.println(Arrays.toString(blackpink));
				for(int i = 0 ; i < blackpink.length; i++) {
					//i번째의 멤버의 이름을 꺼내서 변수에 기억
					String name = blackpink[i];
					//변수에 기억된 데이터를 출력
					System.out.println(name);
				}
		//둘리멤버를 추가해서 출력:배열은 한번 만들어지면 크기와 타입을 수정할 수 없다. 다시만들어서 변수에 기억시킨다.
		String[] tmp = new String[5];
		for(int i = 0 ; i < 4 ; i++) {
			tmp[i] = blackpink[i];
		}
		//5번째 방이 비어있음
		tmp[4]="둘리";
		blackpink = tmp;
		//하나씩 꺼내서 출력
		//배열과 같은 데이터는 향상된 for명령이 편함
		for(String name : blackpink){
			//의미 - blackpink의 데이터를 순차적으로 하나씩 꺼내서 name변수에 기억시키세요
			//출력
			System.out.print(name + " ");
		}
		
	}
}





























