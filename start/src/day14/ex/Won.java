package day14.ex;
/**
 * 이 클래스 원의 정보를 저장하는 함수
 * 양동수
 * 2022-03-17
 * v1.0
 */
public class Won {
	private int rad;
	private double area, arround;
	public Won() {}
	public Won(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	
	public void setArea() {
		this.area = rad*rad*3.14;
	}
	public void setArround() {
		this.arround = rad*2*3.14;
	}
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		Won o1 = null;
		try{
			o1 = (Won) o;
		}catch(Exception e){
			result = false;
			return result;
		}
		result = (o1.getRad()==this.rad)?(true):(false);
		return result;
	}
	
	@Override
	public String toString() {
		return "반지름이 "+this.rad+" 이고, 면적이 "+this.area+", 둘레가 "+this.arround+"인 원입니다.";
	}
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public static void main(String[] args) {
		new Won();
	}

}
