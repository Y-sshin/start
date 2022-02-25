package day04.ex;
/*
 	문제3
 		게시물을 게시판에 출력하는데 하나의 페이지에 게시물을 15개 출력할 예정이다.
 		게시물 수를 랜덤하게 발생시켜서 그 게시판의 페이지가 몇 페이지가 필요한지 계산하여 출력하는
 		프로그램을 작성하세요.
 		게시물이 없는 경우는 게시물이 없는 페이지가 적어도 1페이지가 필요
 */
public class ex03 {
	public static void main(String[] args) {
		int text = (int)(Math.random()*(100-1+1)+1);
		int page = text/15+1;
		System.out.println("게시해야 할 게시물의 수는 " + text + "개이고," + "필요한 페이지의 수는 " + page + "개이다.");
	}

}
