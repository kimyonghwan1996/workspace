package class_;
/*
 [문제] 성적처리
클래스명 : SungJuk
필드 : name, kor, eng, math, tot, avg, grade
메소드 : setData(이름, 국어, 영어, 수학)
       calc() - 총점, 평균, 학점 계산
	   getName()
	   getKor()
	   getEng()
	   getMath()
       getTot()
       getAvg()
       getGrade()

클래스명 : SungJukMain

[실행결과]
----------------------------------------------------
이름		국어		영어		수학		총점		평균		학점
----------------------------------------------------
홍길동	90		95		100
 */
public class Sungjuk {
	
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private char grade;
	
	public void setData(String n, int a, int b, int c) {
		name = n;
		kor = a ;
		eng = b ;
		mat = c ;
	}
	public void Cac() {
		tot = kor + eng + mat ;
	
		avg = tot/3. ;

		if(avg>=90)grade = 'A' ;
		else if (avg>=80)grade = 'B' ;
		else if (avg>=70)grade = 'C' ;
		else if (avg>=60)grade = 'D' ;
		else grade = 'F' ;
		}
	
	
	
	public String getName() {
		return name ;	
	}
	public int getKor() {
		return kor ;	
	}
	public int getEng() {
		return eng ;	
	}
	public int getMat() {
		return mat ;	
	}
	public int getTot() {
		return tot ;	
	}
	public double getAvg() {
		return avg ;	
	}
	public char getGrade() {
		return grade ;	
	}
}
