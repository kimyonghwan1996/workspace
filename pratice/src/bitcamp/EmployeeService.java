package bitcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
    private ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		Employee employee = null;
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("-------------");
            System.out.println("  1. 등록");
            System.out.println("  2. 출력");
            System.out.println("  3. 수정");
            System.out.println("  4. 삭제");
            System.out.println("  5. 검색");
            System.out.println("  6. 정렬");
            System.out.println("  7. 끝");
            System.out.println("-------------");
            System.out.print("번호를 입력하세요 : ");
            num = scan.nextInt();
            
            if (num == 7) break;
            if (num == 1) employee = new EmployeeInsert(); 
            else if (num == 3) employee = new EmployeeUpdate();
            else if (num == 4) employee = new EmployeeDelete();
            else if (num == 5) employee = new EmployeeSearch();
            else if (num == 6) employee = new EmployeeSort();
            else if (num == 2) employee = new EmployeePrint();
            else {System.out.println(" 선택하세요 ");
            	continue;
            }
            employee.execute(list); //호출
        
        
		}
	}

}
