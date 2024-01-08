package bitcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeInsert implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        System.out.println();
        Scanner scan = new Scanner(System.in);

        
        System.out.println("사원번호 입력 : ");
        int no = scan.nextInt();

        for(EmployeeDTO employeeDTO : list){
            if(employeeDTO.getNo() == no) {System.out.println("사원 번호가 중복 되었습니다.");return;}
            else continue;
        }
        System.out.println("이름 입력 : ");
        String name = scan.next();
        System.out.println("직급 입력 : ");
        String job = scan.next();
        System.out.println("기본급 입력 : ");
        int basic = scan.nextInt();
        System.out.println("수당 입력 : ");
        int extra = scan.nextInt();
            
        EmployeeDTO employeeDTO = new EmployeeDTO(no, name, job, basic, extra);
        employeeDTO.calc();

        list.add(employeeDTO);
        System.out.println("입력되었습니다");


    }

}
