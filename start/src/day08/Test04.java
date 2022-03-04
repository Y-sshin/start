package day08;

import java.util.Arrays;

/*
	정수 5개를 기억할 배열을 만들고 데이터를 채워준 후에 1번 방에서부터 3번방 까지의 데이터만 다른 배열에 깊은 복사를 해봄
	이때 복사될 배열은 길이를 10으로 하세요
*/
public class Test04 {

	public static void main(String[] args) {
		int[] ori = {10,20,30,40,50};//원본 배열 origin
		int[] copy = new int[10];//toCopy 맨처음에는 0으로 채워져있다.
		System.arraycopy(ori,0,copy,0,3);//깊은복사
		System.out.println("ori :"+Arrays.toString(ori));//ori배열 내용 출력
		System.out.println("ori :"+Arrays.toString(copy));//copy배열 내용 출력		
	}//static블럭

}
