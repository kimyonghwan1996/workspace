package class_;

import java.text.DecimalFormat;

public class SalaryDTOmain {

	public static void main(String[] args) {

		SalaryDTO[] ar = new SalaryDTO[3]; //Object[]로 바꾸면 모든 클래스 이용 가능(상속의 다형성)
		
		ar[0] = new SalaryDTO();
		ar[1] = new SalaryDTO();
		ar[2] = new SalaryDTO();
		
		ar[0].setData("홍길동", "이사", 4800000, 300000);
		ar[1].setData("송중기", "사원", 2000000, 100000);
		ar[2].setData("아이유", "주임", 2900000, 150000);
		
		//=================================================
		System.out.println("이름\t\t직급\t\t기본급\t\t수당\t\t합계\t\t세금\t\t월급");
		
		DecimalFormat formatter = new DecimalFormat();
		for(SalaryDTO data : ar) {
			data.calc();
			System.out.println(data.getName()  + "\t\t"
											+ data.getJob() + "\t\t"
											+ formatter.format(data.getBasic()) + "\t"
											+ formatter.format(data.getExtra())  + "\t\t"
											+ formatter.format(data.getTot())  + "\t"
											+ formatter.format(data.getRate())+"%"  + "\t\t"
											+ formatter.format(data.getSal()) 
											);
			
		}
		
		for(int i = 0; i < ar.length; i++) {
			ar[i].calc();
			
			System.out.println(ar[i].getName()+"\t\t"+ar[i].getJob()+"\t\t"
					+ar[i].getBasic()+"\t\t"+ar[i].getExtra()+"\t\t"
					+String.format("%,d",ar[i].getTot())
					+"\t"+String.format("%,d",(int)ar[i].getTax())
					+"\t\t"+String.format("%,d",(int)ar[i].getSal()));
			}

	}

}
