
enum Color{
    RED,GREEM,BLUE
}

class Final {
    public final String FRUIT = "사과";
    public final String FRUIT2;

    public static final String ANIMAL = " 호랑이 ";

    public static final String ANIMAL2;
    static{
        ANIMAL2 = "기린";
    }

    //public static final int RED = 0;
    //public static final int GREEN = 0;
    //public static final int BLUE = 0;


    public Final(){
        FRUIT2 = "딸기";
    }
}







public class FinalMain {
    public static void main(String[] args) {
           final int AGE = 25;
           // AGE ++; 에러
            System.out.println("AGE : " + AGE);
            
            final String NAME;
            NAME = "홍길동";
            // NAME = "홍길동1"; 한번더하면 에러

            System.out.println("NAME : " + NAME);
            System.out.println();
            Final f = new Final();
            
            System.out.println("FRUIT : " + f.FRUIT);
            System.out.println("FRUIT : " + f.FRUIT2);
            System.out.println();

            System.out.println("ANIMAL : " + f.ANIMAL);
            System.out.println("ANIMAL : " + f.ANIMAL2);

            System.out.println("빨강 : " + Color.RED);
            System.out.println("빨강 : " + Color.RED.ordinal());

            for(Color data : Color.values()){
                System.out.println(data.ordinal() + " : " + data);
            }
    }
}
