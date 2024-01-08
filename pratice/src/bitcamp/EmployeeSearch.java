package bitcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeSearch implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        
        System.out.println("사원 번호 입력 : ");
        int no = scan.nextInt();

        System.out.println("사원번호\t이름\t\t직급\t기본급\t\t수당\t\t합계\t\t세율\t세금\t\t월급");
        for(EmployeeDTO employeeDTO : list){
            if(employeeDTO.getNo() == no){
            System.out.println(employeeDTO);}
        }
        
    }

}
