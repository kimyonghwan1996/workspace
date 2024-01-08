package homework;
/*
[문제] 성적 계산
이름이 L(name)이고 국어점수 85(kor), 영어점수 90(eng), 수학점수 100(math)일때 총점(tot)과 평균(avg)을 구하시오

[조건]
총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
평균의 소수이하 3째자리까지 출력

[실행결과]
		*** L 성적표 ***
국어		영어		수학		총점		평균
85		90		100		xxx		xx.xxx
 */
public class grade {

	public static void main(String[] args) {
		char name = 'L';
		int kor = 85;
		int eng = 90;
		int math = 100;
		
		int tot = kor + eng + math;
		//double avg = (float)tot / 3; //(double)tot/3. 두개중 하나 //강제형변환 / 자동형변환
		String avg =  String.format("%.3f",(float)tot / 3);
		
		System.out.println("\t ***"+ name +"***");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kor + "\t " + eng + "\t " + math + 
				"\t " + tot + "\t " +avg); 
		/*
		System.out.println("L 성적표");
		System.out.println("국어" + kor + "영어" + eng + "수학" + math + 
				"총점" + tot + "평균" + String.format("%.3f",avg));
		*/

	}

}
