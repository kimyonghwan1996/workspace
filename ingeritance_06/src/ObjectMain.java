//class Test extends Object{}
/**
 * Test
 */
class Test extends Object{
    @Override
    public String toString(){
        return getClass() + "@개바부";//return "김용환";
    }
}

public class ObjectMain extends Object{
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("객체 t = " + t);
        System.out.println("객체 t = " + t.toString());
        System.out.println("객체 t = " + t.hashCode());

        String str = "apple";
        System.out.println("객체 str = " + str);
        System.out.println("객체 str = " + str.toString());
        System.out.println("객체 str = " + str.hashCode()); //표현 할 수 있는 문자열은 무한대이기 때문에 표현이 다 안됨.

        String aa = new String("apple");
        String bb = new String("apple"); 
        System.out.println((aa==bb)); //참조값비교 false
        System.out.println(aa.equals(bb));//문자열비교 true
        System.out.println();

        Object cc = new Object();
        Object dd = new Object();
        System.out.println((cc==dd));
        System.out.println(cc.equals(dd));
        System.out.println();

        Object ee = new String("apple");
        Object ff = new String("apple");
        System.out.println((ee==ff));
        System.out.println(ee.equals(ff));


    }
}

/*
 class Object{
    public boolean equals(Object obj){} // 참조값비교
    public String toString(){} // 16진수
    public Int hashcode()() //표현 할 수 있는 문자열은 무한대이기 때문에 표현이 다 안됨.
 }
 class String object{
    public boolean equals(Object obj){} // 참조값비교
    public String toString(){} // 16진수
    public Int hashcode()() //표현 할 수 있는 문자열은 무한대이기 때문에 표현이 다 안됨.
 }
 */
