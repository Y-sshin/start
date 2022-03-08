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
	public String name[];//학생들의 이름, 자동생성되거나 생성자가 받아들인 객체를 저장함
	public int ban[], no[], kor[], eng[], math[];//학생정보와 성적
	public Student[] stud;//생성자에서 받아들인 배열에따라 저장공간 변동있음
	
	
	public ex01() {//기본 생성 역할의 생성자
		name = new String[] {"동수","동구","동준","동국","동규"};//과제 요구사항 5명의 학생배열 생성
		dataInputOutput();//자료 생성, 입력, 출력 역할의 단일 함수
	}
	public ex01(String[] name) {//생성자 Overloading
		this.name = name;//입력되는 학생배열이 있을 경우 그에따른 학생배열 생성
		dataInputOutput();//자료 생성, 입력, 출력 역할의 단일 함수
	}
	
	public static void main(String[] args) {//진입점
		new ex01();
	}
	
	public void dataInputOutput() {//생성자에서 지정된 만큼, 각 자료배열들의 공간 확보
		ban = new int[name.length];
		no = new int[name.length];
		kor = new int[name.length];
		eng = new int[name.length];
		math = new int[name.length];
		stud = new Student[name.length];
		
		loop://반, 번호가 동시에 중복될 경우 루프 회귀지점
		for(int i = 0 ; i < name.length ; i++) {
			ban[i] = (int)(Math.random()*10+1);//10개의 반이 있다 가정하여 학생 수 만큼 랜덤생성
			no[i] = (int)(Math.random()*30+1);//한 반 당 30명이 있다 가정하여 학생 수 만큼 랜덤생성
			kor[i] = (int)(Math.random()*41+60);
			eng[i] = (int)(Math.random()*41+60);
			math[i] = (int)(Math.random()*41+60);
			for(int j = 0 ; j < i ; j++) {//반, 번호의 동시 중복 판별
				if(ban[i]==ban[j]&&no[i]==no[j]) {//판별 및 절삭연산으로 메모리 절약
					i -= 1;
					continue loop;
				}
			}
		}
		
		for(int i = 0 ; i < name.length ; i++) {
			stud[i] = new Student();//학생배열에 Student클래스 생성하여 입력
			stud[i].setName(name[i]);//학생의 성명을 각 학생들의 클래스로 입력
			stud[i].setBan(ban[i]);//생성된 각각의 정보를 각 학생들의 클래스로 입력
			stud[i].setNo(no[i]);
			stud[i].setKor(kor[i]);
			stud[i].setEng(eng[i]);
			stud[i].setMath(math[i]);
			stud[i].setTotal(stud[i].getKor()//각 학생의 클래스에서 국, 영, 수 출력 후 합계 입력
					+stud[i].getEng()+stud[i].getMath());
			stud[i].setAvg((double)stud[i].getTotal()/3);//각 학생의 합계 출력 후 평균입력
			stud[i].setRank(1);//각 학생의 석차 초기화
		}

		for(int i = 0 ; i < name.length ; i++) {//학생들의 '평균' 비교 및 석차값 누적입력
			for(int j = 0 ; j < name.length ; j++) {
				if(i==j) {
					continue;
				}else if(stud[i].getAvg()>stud[j].getAvg()){
					stud[j].setRank(stud[j].getRank()+1);
				}
			}
		}
		for(int i = 0 ; i < name.length ; i++) {//각 학생의 과목점수, 총점, 평균, 석차 출력
			System.out.println((i+1)+"번째 학생 성적..");
			System.out.println();
			System.out.println(stud[i].getBan()+"반의 "+stud[i].getNo()+"번 "
					+"성명 :"+stud[i].getName()+" 국어점수 :"+stud[i].getKor()
					+" 영어점수 :"+stud[i].getEng()+" 수학점수 :"+stud[i].getMath()
					+" 평  균 :"+stud[i].getAvg()+" 총  점 :"+stud[i].getTotal()
					+" 석  차 :"+stud[i].getRank());
			System.out.println();
		}

	}
}
