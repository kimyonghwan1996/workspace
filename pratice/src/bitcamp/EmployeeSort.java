package bitcamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeSort implements Employee{
    @Override
    public void execute(ArrayList<EmployeeDTO> list) {
        Scanner scan = new Scanner(System.in);
        
        Employee employee = null; 
        int num;
        Collections.sort(list);

        System.out.println("사원번호\t이름\t\t직급\t기본급\t\t수당\t\t합계\t\t세율\t세금\t\t월급");
        for(EmployeeDTO sungJuckDTO : list){
            System.out.println(sungJuckDTO);
            }
            System.out.println();
    }

}
