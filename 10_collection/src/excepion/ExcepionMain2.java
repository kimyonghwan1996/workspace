package excepion;

import java.util.Scanner;

public class ExcepionMain2 {
    private int x;
    private int y;


    public void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("x 숫자 입력");
        x = sc.nextInt();
        System.out.println("y 숫자 입력");
        y = sc.nextInt();

    }
    public void output(){
        int mul = 1;

        if ((y < 0)) {
           for(int i = 1; i<=y; i++){
            mul *= x;
            }
            System.out.println(mul); 
        }else{
            //System.out.println("y는 0보다 크거나 같아야 한다");
        
            //강제로 exception
            
            try{
                throw new Exception("y는 0보다 크거나 같아야 한다");
            }catch(Exception e){
                e.printStackTrace();
            }
        
        }
        
    }


    public static void main(String[] args) {
        ExcepionMain2 excepionMain2 = new ExcepionMain2();
        
        excepionMain2.calc();
        excepionMain2.output();
    }
        
}
