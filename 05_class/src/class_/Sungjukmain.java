package class_;

public class Sungjukmain {

	public static void main(String[] args) {
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------");
		Sungjuk aa = new Sungjuk(); //생성
		aa.setData("홍길도", 90, 96, 100);
		aa.Cac();
		
		System.out.println(aa.getName()+"\t"+aa.getKor()+"\t"
							+aa.getEng()+"\t"+aa.getMat()+"\t"+aa.getTot()
							+"\t"+String.format("%.2f",aa.getAvg())
							+"\t"+aa.getGrade());
		//--------------------------------
		Sungjuk bb = new Sungjuk(); //생성
		bb.setData("라이언", 90, 96, 1);
		bb.Cac();
		System.out.println(bb.getName()+"\t"+bb.getKor()+"\t"
				+bb.getEng()+"\t"+bb.getMat()+"\t"+bb.getTot()
				+"\t"+String.format("%.2f",bb.getAvg())
				+"\t"+bb.getGrade());
		
		//--------------------------------
			Sungjuk cc = new Sungjuk(); //생성
			cc.setData("프로도", 40, 68, 1);
			cc.Cac();
			System.out.println(cc.getName()+"\t"+cc.getKor()+"\t"
					+cc.getEng()+"\t"+cc.getMat()+"\t"+cc.getTot()
					+"\t"+String.format("%.2f",cc.getAvg())
					+"\t"+cc.getGrade());
	}
}
