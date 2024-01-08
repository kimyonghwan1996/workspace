package sungJuck;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJuckService {
    private ArrayList<SungJuckDTO> list= new ArrayList<SungJuckDTO>();

    public void menu(){
        Scanner scan = new Scanner(System.in);
        
        SungJuck sungJuck = null; //클래스나 인터페이스 초기화는 null
        int num = 0;


        while (true) {
            System.out.println();
            System.out.println("**********************");
            System.out.println("    1. 입력");
            System.out.println("    2. 출력");
            System.out.println("    3. 수정");
            System.out.println("    4. 삭제");
            System.out.println("    5. 정렬");
            System.out.println("    6. 끝");
            System.out.println("**********************");
            num = scan.nextInt();

            if (num == 6) break;
            if (num == 1) sungJuck = new SungJuckInsert(); 
            else if (num == 2) sungJuck = new SungJuckPrint();
            else if (num == 3) sungJuck = new SungJuckUpdate();
            else if (num == 4) sungJuck = new SungJuckDelete();
            else if (num == 5) sungJuck = new SungJuckSort();
            else {System.out.println("1~6 중에 선택하세요");
            	continue;}
            
            sungJuck.execute(list); 
            System.out.println();

        }
    }


}
