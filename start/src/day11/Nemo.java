package day11;

public class Nemo {
	private int garo, sero, area, rank;
	
	public Nemo(){}//기본생성자
	public Nemo(int garo, int sero){//입력받은 데이터를 세팅해서 객체로 만들 수 있는 생성자
		this.garo = garo;
		this.sero = sero;
		//this.area = garo*sero;
		setArea();
		rank = 1;
	}

	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {
		area = garo*sero;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Nemo [garo=" + garo + ", sero=" + sero + ", area=" + area + "]";
	}

}
