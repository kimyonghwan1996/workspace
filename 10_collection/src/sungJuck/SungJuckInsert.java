package sungJuck;

import java.util.ArrayList;
import java.util.Scanner;


public class SungJuckInsert implements SungJuck{

    @Override
    public void execute(ArrayList<SungJuckDTO> list) {
        System.out.println();

        Scanner scan = new Scanner(System.in);

        System.out.println("번호 입력 : ");
        int no = scan.nextInt();
        System.out.println("이름 입력 : ");
        String name = scan.next();
        System.out.println("국어점수 입력 : ");
        int kor = scan.nextInt();
        System.out.println("영어점수 입력 : ");
        int eng = scan.nextInt();
        System.out.println("수학점수 입력 : ");
        int math = scan.nextInt();

        SungJuckDTO sungJuckDTO = new SungJuckDTO(no, name, kor, eng, math);
        sungJuckDTO.calc();

        list.add(sungJuckDTO);
        System.out.println("입력되었습니다");
    }
}
