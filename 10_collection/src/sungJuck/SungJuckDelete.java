package sungJuck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.text.InternationalFormatter;

public class SungJuckDelete implements SungJuck{
    @Override
    public void execute(ArrayList<SungJuckDTO> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println();


        System.out.println("이름 입력 : ");
        String input_name = scan.next();
        /* 
        for(int i = 0; i <= list.size(); i++){
            if(list.get(i).getName().equals(input_name)){
                list.remove(list.get(i));
                cnt++;
                i--;
            }
            else System.out.println("잘못된 회원 입니다.");
        }
        System.out.println(cnt+"건 삭제되었습니다.");
        return;
        */
        int i = 0;
        
        int cnt = 0;
        /* 
        while (i < list.size()) {
            if (list.get(i).getName().equals(input_name)) {
                list.remove(i);
                cnt++;
            } else {
                i++;
            }
        }
        */
        /*
         for(SungJuckDTO sungJuckDTO : list){
            if(sungJuckDTO.getName().equals(name)){
                cnt ++;
                list.remove(sungJuckDTO);
            }
         } //sol

         
         */

         Iterator<SungJuckDTO> it = list.iterator();//생성
         while(it.hasNext()){  
           SungJuckDTO sungJuckDTO = it.next(); //현재위치의 항목을 꺼내서 저장한 후 다음 항목으로 이동
            if(sungJuckDTO.getName() == input_name){
                it.remove(); //it.next()(it에)보관하고 있는 항목을 삭제
                cnt ++;
            }
         }//sol 2

        if(cnt >= 1) System.out.println(cnt + "건 삭제되었습니다.");
        else System.out.println("회원의 정보가 없습니다");
    }

}