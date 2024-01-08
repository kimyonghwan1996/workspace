package bitcamp;

import java.util.ArrayList;

public class EmployeePrint implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        System.out.println();
        System.out.println("사원번호\t이름\t\t직급\t기본급\t\t수당\t\t합계\t\t세율\t세금\t\t월급");
        for(EmployeeDTO employeeDTO : list){
            System.err.println(employeeDTO);
        }
    }

}
