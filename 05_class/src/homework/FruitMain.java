package homework;
/*
 과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자(품명, 1월, 2월, 3월)
calcTot()
display()
public static void output()

클래스 : FruitMain

[실행결과]
---------------------------------
PUM		JAN   FEB   MAR		TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     xxx
딸기     25    30    90     xxx
---------------------------------
        xxx   xxx   xxx				output()로 처리

sol
public class Fruit {
	private String pum;
    private int jan, feb, mar, tot;
    private static int sumJan, sumFeb, sumMar;
    
    public Fruit(String pum, int jan, int feb, int mar) {
        this.pum = pum;
        this.jan = jan;
        this.feb = feb;
        this.mar = mar;
    }
    
    public void calcTot() {
        tot = jan + feb + mar;
        
        sumJan = sumJan + jan;
        sumFeb += feb;
        sumMar += mar;
    }
    
    public void display() {
    	System.out.println(pum + "\t" + jan + "\t" + feb + "\t" + mar + "\t" + tot);
    }
    
    public static void output(){
        System.out.println("\t" + sumJan + "\t" + sumFeb + "\t" + sumMar);
    }
}


public class FruitMain {

	public static void main(String[] args) {
		Fruit[] ar = {new Fruit("사과", 100, 80, 75),
        			  new Fruit("포도", 30, 25, 10),
        			  new Fruit("딸기", 25, 30, 90)};
		
		System.out.println("-----------------------------------");
        System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
        System.out.println("-----------------------------------");
		for (int i=0; i <ar.length; i++) {
			ar[i].calcTot();
			ar[i].display();
		}//for
		System.out.println("-----------------------------------");
		Fruit.output();
	}

}

 */

class Fruit{
	private String[] pum = {"사과", "포도", "딸기"};
	private int[] jan = {100,30,25};
	private int[] feb = {80,25,30};
	private int[] mar = {75,10,90};
	private int[] tot = new int[3];;
	private int sumJan;
	private int sumFeb;
	private int sumMar;
	

		//public Fruit() {
		//	this.tot = new int[3];
		//}
	
	public void tot() {
		this.tot = new int[3]; 
		for(int i = 0; i < 3 ; i++) {
			this.tot[i] = this.jan[i] + this.feb[i] + this.mar[i];
		}
	}
	public void display(){
		sumJan = 0;
		sumFeb = 0;
		sumMar = 0;

		for(int i = 0; i < pum.length ; i++) {
			sumJan += jan[i]; 
			sumFeb += feb[i]; 
			sumMar += mar[i]; 
		}
		
	}

	public static void output() {
		Fruit fr = new Fruit(); 
		fr.tot(); 
		fr.display();

		System.out.println("-------------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-------------------------------------");
		for(int i = 0; i < fr.pum.length ; i++) {
			System.out.println(fr.pum[i] +"\t"+ fr.jan[i] +"\t"+ fr.feb[i] +"\t"+ fr.mar[i]+"\t"+ fr.tot[i]);
		}
		System.out.println("-------------------------------------");    
		System.out.print("\t" +fr.sumJan +"\t"+ fr.sumFeb +"\t"+ fr.sumMar); 
	}
	
}
public class FruitMain {

	public static void main(String[] args) {
		//Fruit fr = new Fruit();
		//fr.tot();
        //fr.display();
        Fruit.output();
	}
}
