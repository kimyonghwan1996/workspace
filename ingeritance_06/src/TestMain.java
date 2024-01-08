package inheritance;

class AA{
	public int a =3;
	public void disp() {
		a += 5;
		System.out.println("AA : " + a + "  ");
	}
}

//---------------------------------------

class BB extends AA{
	public int a =8;
	public void disp() {
		this.a += 5;
		System.out.println("BB : " + a + "  ");
	}
}

//---------------------------------------
public class TestMain {

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp();
		System.out.println(aa.a); //13
		System.out.println();
		
		AA bb = new BB(); //부모 = 자식
		bb.disp();
		System.out.println(bb.a); //3
		
		BB cc = (BB) bb; // 자식 = (자식)부모, 형변환
		cc.disp();
		System.out.println(cc.a); //18
		
		
		AA dd = new AA();
		dd.disp();
		System.out.println(dd.a);//8
		
		BB ee = (BB)dd; //
		//ee.disp(); error
		
	}

}
