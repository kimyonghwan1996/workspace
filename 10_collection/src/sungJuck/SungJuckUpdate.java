package sungJuck;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJuckUpdate implements SungJuck{
    @Override
    public void execute(ArrayList<SungJuckDTO> list) {
        Scanner scan = new Scanner(System.in);

        System.out.println();

        System.out.println("번호 입력 : ");
        int input_no = scan.nextInt();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getNo() == input_no){
               // System.out.println("새 번호 입력 : ");
               // int change_no = scan.nextInt();
               // list.get(i).setNo(change_no);

                System.out.println("새 이름 입력 : ");
                String change_name = scan.next();
                list.get(i).setName(change_name);

                System.out.println("새 국어 입력 : ");
                int change_kor = scan.nextInt();
                list.get(i).setKor(change_kor);

                System.out.println("새 영어 입력 : ");
                int change_eng = scan.nextInt();
                list.get(i).setEng(change_eng);

                System.out.println("새 수학 입력 : ");
                int change_math = scan.nextInt();
                list.get(i).setMath(change_math);
                list.get(i).calc(); //재계산
                return;
            }
          }
          System.out.println("잘못된 번호 입니다.");
    }
}