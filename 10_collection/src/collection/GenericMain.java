package collection;

public class GenericMain<T> {

    private T a;
    public T getA() {return a;}

    public void setA(T a){this.a = a;}


    public static void main(String[] args) {
        GenericMain<String> aa = new GenericMain<String>();
        aa.setA("홍길동");
        System.out.println(aa.getA());

        // aa.setA(49); 정수형 들어와서 에러
        GenericMain<Integer> bb = new GenericMain<Integer>();
        bb.setA(23);
        System.out.println(bb.getA());
    }
}
