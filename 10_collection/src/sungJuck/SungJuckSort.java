package sungJuck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import collection.PersonDTO;

public class SungJuckSort implements SungJuck{

    @Override
    public void execute(ArrayList<SungJuckDTO> list) {

        Scanner scan = new Scanner(System.in);
        
        SungJuck sungJuck = null; //클래스나 인터페이스 초기화는 null
        int num = 0;

        while (true) {
            System.out.println();
            System.out.println("**********************");
            System.out.println("    1. 총점으로 내림차순");
            System.out.println("    2. 이름으로 오름차순");
            System.out.println("    3. 이전 메뉴");
            System.out.println("**********************");
            num = scan.nextInt();

            if (num == 3) return;
            if (num == 1) {
                Collections.sort(list);
                for(SungJuckDTO sungJuckDTO : list){
                    System.out.println(sungJuckDTO);
                }
                System.out.println();
            }
            else if (num == 2) {
                Comparator<SungJuckDTO> com = new Comparator<SungJuckDTO>() {
                    @Override
                    public int compare(SungJuckDTO s1, SungJuckDTO s2){
                        return s1.getName().compareTo(s2.getName());
                    }
                };
            }
            
            System.out.println();
            for(SungJuckDTO sungJuckDTO : list){
                System.out.println(sungJuckDTO);
            }

        }
    }



}
