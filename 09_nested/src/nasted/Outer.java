package nasted;

public class Outer {

    private String name;

    public void output(){
        System.out.println("이름 : " + this.name + "\t나이 : " + new Inner().age); // age는 접근 불가, 객체생성시 가능 ,this 생략가능
    }
    

    class Inner{
        private int age;

        public void disp(){
            System.out.println("이름 : " + Outer.this.name + "\t나이 : " + age); //앞의 this는 생략가능
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.name = "홍길동";

        Inner inner = outer.new Inner();
        inner.age = 25;
        inner.disp();

        // 접근 불가, 에러 inner.name = "코난";
        
        Inner inner2 = outer.new Inner();
        inner2.age = 30;
        inner2.disp();

        Inner inner3 = new Outer().new Inner(); // 
        inner3.age = 35;
        inner.disp();

    }
    /**
     * Outer2
     */
    public class Outer2 {
    
        
   }

   void method(){

   }
}  


