package day10.ex;
/*
	다음 변수를 가지는 Student 클래스를 제작하세요
	String name;
	int ban, no, kor, eng, math;
	클래스를 만들고
	ex01클래스에서
	한 명의 데이터를 입력해서 출력하기 5명의 데이터를 배열로 만들어서 데이터 입력하고 출력하고.
	1. 한개의 함수 내에서 처리하기'
	2. 기능별로 분리하여 함수 만들어서 처리하기
	보너스]
		int rank, total;
		double avg;	
*/
public class ex01 {
	public String name[];
	public int ban[], no[], kor[], eng[], math[];
	public Student[] stud;
	
	
	public ex01() {
		dataInputOutput();
	}
	
	public static void main(String[] args) {
		new ex01();
	}
	
	public void dataInputOutput() {
		name = new String[] {"동수","동구","동준","동국","동규"};
		ban = new int[name.length];
		no = new int[name.length];
		kor = new int[name.length];
		eng = new int[name.length];
		math = new int[name.length];
		stud = new Student[name.length];
		
		for(int i = 0 ; i < name.length ; i++) {
			ban[i] = (int)(Math.random()*10+1);
			no[i] = (int)(Math.random()*30+1);
			kor[i] = (int)(Math.random()*41+60);
			eng[i] = (int)(Math.random()*41+60);
			math[i] = (int)(Math.random()*41+60);
		}
		for(int i = 0 ; i < name.length ; i++) {
			stud[i] = new Student();
			stud[i].setName(name[i]);
			stud[i].setBan(ban[i]);
			stud[i].setNo(no[i]);
			stud[i].setKor(kor[i]);
			stud[i].setEng(eng[i]);
			stud[i].setMath(math[i]);
		}
		for(int i = 0 ; i < name.length ; i++) {
			stud[i].setAvg((double)stud[i].getKor()+stud[i].getEng()+stud[i].getMath()/3);
			stud[i].setTotal(stud[i].getKor()+stud[i].getEng()+stud[i].getMath());
		}
		for(int i = 0 ; i < name.length ; i++) {
			stud[i].setRank(1);
		}
		for(int i = 0 ; i < name.length ; i++) {
			for(int j = 0 ; j < name.length ; j++) {
				if(i==j) {
					continue;
				}else if(stud[i].getAvg()>stud[j].getAvg()){
					stud[i].setRank(stud[i].getRank()+1);
				}
			}
		}
		for(int i = 0 ; i < name.length ; i++) {
			System.out.println((i+1)+"번째 학생 성적..");
			System.out.println(stud[i].getBan()+"반의 "+stud[i].getNo()+"번 "
					+"성명 :"+stud[i].getName()+" 국어점수 :"+stud[i].getKor()
					+" 영어점수 :"+stud[i].getEng()+" 수학점수 :"+stud[i].getMath()
					+" 평  균 :"+stud[i].getAvg()+" 총  점 :"+stud[i].getTotal()
					+" 석  차 :"+stud[i].getRank());
		}

	}
}
