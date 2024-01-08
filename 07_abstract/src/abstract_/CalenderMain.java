package abstract_;

import java.util.Calendar;
import java.util.Scanner;

/*
 [문제] 만년달력
 클래스명 : CalenderEx
 필드 : 
 메소드  
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력

- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() 출력

CalenderMain

[실행결과]
년도 입력 : 2002
월 입력 : 10	

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31 for문
 */
class CalenderEx{
    
    private int year;
    private int month;
    private int day;
    Calendar cal = Calendar.getInstance();
    Scanner scan = new Scanner(System.in);
    
    public CalenderEx(){
        this.year = 0;
        this.month = 0;
    }
    /*
     public CalenderEx(){
        Scanner scan = new Scanner(System.in);

        System.out.print("년도 : ");
        this.year = scan.nextInt();
        System.out.print("월 : ");
        this.month = scan.nextInt()
     */

    public int calc(){
        do{System.out.print("년도 : ");
            this.year = scan.nextInt();
        }while(year < 1);
        do{System.out.print("월 : ");
            this.month = scan.nextInt();
        }while(month > 12 || month < 1);
        cal.set(year, month-1, 1);
        return day = cal.get(Calendar.DAY_OF_WEEK);
    }
    /* 
     public oid calc(){
        Calendar cal = Calendar.getInstance(); 
        cal.set(cal.YEAR, year);
        cal.set(cal.MONTH, month-1);
        cal.set(cal.DAY_OF_MONTH, 1);
        firstDay = cal.get(Calendar.DAY_OF_WEEK); // 1일의 요일 구하기
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 달의 말일 구하기
     }
    */

    public void display(){
        System.out.println();
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        for(int i = 0; i < day-1; i++){
            System.out.print("\t");
        } // 달의 첫번째날
        for(int i = 0; i <=cal.getActualMaximum(Calendar.DAY_OF_MONTH)-1 ; i++){
            if(day%7 != 0){
                System.out.print(i+1 + "\t");
            }
            else if(day%7 == 0){
            System.out.println(i+1);
            }
            day++;
        }
        if (day%7 != 1) {
            System.out.println();
        } //마지막 날 까지
        System.out.println("--------------------------------------------");
    }
    /*
     public void display(){
        for(int i=0; i<firstDay-1; i++) {
			System.out.print("\t");
		}
        for(o = 0; i < lastday; i++){
            System.out.print(i + "\t");
            if((i%7) == 0 System.out.println();
			firttDay++;
        }
        System.out.println();
     }
     */

}

public class CalenderMain {
    public static void main(String[] args) {
        CalenderEx aa = new CalenderEx();
        aa.calc();
        aa.display();
    }
}
