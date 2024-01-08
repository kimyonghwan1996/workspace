package bitcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDelete implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        
        System.out.println("사원 번호 입력 : ");
        int no = scan.nextInt();


        for(EmployeeDTO employeeDTO : list){
            if(employeeDTO.getNo() == no){
                list.remove(employeeDTO);
                System.out.println("사원 번호" + no + "삭제되었습니다.");
            }
         }
    }

}
