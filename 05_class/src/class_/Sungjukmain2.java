package class_;

public class Sungjukmain2 {

	public static void main(String[] args) {
		
		Sungjuk aa = new Sungjuk(); 
		Sungjuk bb = new Sungjuk(); 
		Sungjuk cc = new Sungjuk();
		
		Sungjuk[] ar = new Sungjuk[3]; //객체배열생성
		
		ar[0] = new Sungjuk();
		ar[1] = new Sungjuk();
		ar[2] = new Sungjuk();
		
		ar[0].setData("홍길도", 90, 96, 100);
		ar[1].setData("라이언", 90, 96, 1);
		ar[2].setData("프로도", 40, 68, 1);
		
		//=================================================
		
		for(int i = 0; i < ar.length; i++) {
			ar[i].Cac();
			System.out.println(ar[i].getName()+"\t"+ar[i].getKor()+"\t"
					+ar[i].getEng()+"\t"+ar[i].getMat()+"\t"+ar[i].getTot()
					+"\t"+String.format("%.2f",ar[i].getAvg())
					+"\t"+ar[i].getGrade());
			
		}//for
		
		System.out.println("==================================================");
		
		for(Sungjuk data : ar) {
			data.Cac();
			System.out.println(data.getName()+"\t"+data.getKor()+"\t"
					+data.getEng()+"\t"+data.getMat()+"\t"+data.getTot()
					+"\t"+String.format("%.2f",data.getAvg())
					+"\t"+data.getGrade());
		}
		
		
	}

}
