package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {
    public static void main(String[] args) {
    
    
        //NumberFormat nf = new NumberFormat(); // error
    NumberFormat nf = new DecimalFormat(); // 부모 = 자식
    //3자리마다 ,찍고, 소수이하3째자리
    System.out.println(nf.format(123345678.456789));
    System.out.println(nf.format(12345678));
    System.out.println();   

    NumberFormat nf2 = new DecimalFormat("#,###.##원");
    //유효숫자가 아닌 것은 표현하지않음
    System.out.println(nf2.format(123345678.456789));
    System.out.println(nf2.format(12345678));
    System.out.println();   
    
    NumberFormat nf3 = new DecimalFormat("#,###.00원");
    //유효숫자가 아닌 것은 표현하지않음
    System.out.println(nf3.format(123345678.456789));
    System.out.println(nf3.format(12345678));
    System.out.println();
    
    //NumberFormat nf4 = NumberFormat.getInstance(); //메소드를 이용하여 클래스 생성
    NumberFormat nf4 = NumberFormat.getCurrencyInstance();
    nf4.setMaximumFractionDigits(2); //소수이하2째자리
    nf4.setMaximumFractionDigits(2); //0을 강제표시
    System.out.println(nf4.format(123345678.456789));
    System.out.println(nf4.format(12345678));
    System.out.println(); 

    NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); //
    nf5.setMaximumFractionDigits(2); //
    nf5.setMaximumFractionDigits(2); //
    System.out.println(nf5.format(123345678.456789));
    System.out.println(nf5.format(12345678));
    System.out.println(); 
    }
   
}
