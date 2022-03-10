package day10.ex;
/**
 * 이 클래스는 학생의 성적을 기억할 용도로 작성된 클래스임
 * @author 양동수
 * @since  2022.03.08
 * @version v 1.0
 */
public class Student {
	public Student() {
		
	}
	public Student(String name, int ban, int no, int kor, int eng,
			int rank, int total, double avg, int math) {
		this.name = name;
		this.ban = ban;
		
	}
	private String name;
	private int ban, no, kor, eng, math;
	private int total, rank;//보너스 문제
	private double avg;//보너스 문제
//------------------------------------------------------------//

	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal() {
		return total;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getRank() {
		return rank;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public double getAvg() {
		return avg;
	}
		
//------------------------------------------------------------//
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getBan() {
		return ban;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getNo() {
		return no;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	
	@Override
	public String toString() {
		return "name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math;
	}

}