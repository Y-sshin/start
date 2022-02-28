package day04.ex;
//ex05에서 입력받는 버젼
import javax.swing.JOptionPane;
public class ex0501 {
	public static void main(String[] args) {
		String sno = JOptionPane.showInputDialog("세자리 정수 입력");//세자리 정수입력받기
		/*입력받은 데이터는 정수형태의 문자열이므로 정수로 변환해줘야 한다.
		  정수형태의문자열을 정수호 변환해주는 기능을 가지고 있는 함수는
		  Integer.parseInt(문자열); 로 작성하면 된다.
		 */
		int no = Integer.parseInt(sno);//입력받은 문자열을 정수로 변환
		int num = no%100;//int num = no - (no/100*100);
		int hap = 1;//num이 50보다 큰지 판별
		int result = 0;
		hap = num>50?(100-num):(num);
		result = (num>50)?(no+hap):(no-hap);//result = (num>50)?((no/100 +1*100)):(no/100*100)
		String str = (num>50)?("더해줘야한다"):("빼줘야한다");
		System.out.println("입력한 정수 " + no + " 는 " + result + " 가까우므로" + hap);//출력
	}
}
