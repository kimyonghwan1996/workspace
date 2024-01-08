package bitcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeUpdate implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        Scanner scan = new Scanner(System.in);

        System.out.println();

        System.out.println("사원 번호 입력 : ");
        int no = scan.nextInt();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getNo() == no){

                System.out.println("수정할 이름 입력 : ");
                String change_name = scan.next();
                list.get(i).setName(change_name);

                System.out.println("수정할 직급 입력 : ");
                String change_job = scan.next();
                list.get(i).setJob(change_job);

                System.out.println("수정할 기본급 입력 : ");
                int change_basic = scan.nextInt();
                list.get(i).setBasic(change_basic);

                System.out.println("수정할 수당 입력 : ");
                int change_extra = scan.nextInt();
                list.get(i).setExtra(change_extra);
                list.get(i).calc(); 
                return;
            }
          }
          System.out.println("잘못된 번호 입니다.");
    }

}
