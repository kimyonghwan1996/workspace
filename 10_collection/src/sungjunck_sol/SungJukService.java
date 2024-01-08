package sungjunck_sol;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		SungJuk sungJuk = null;
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("-------------");
            System.out.println("  1. 입력");
            System.out.println("  2. 출력");
            System.out.println("  3. 수정");
            System.out.println("  4. 삭제");
            System.out.println("  5. 정렬");
            System.out.println("  6. 끝");
            System.out.println("-------------");
            System.out.print("번호를 입력하세요 : ");
            num = scan.nextInt();
            
            if(num==6) break;
            if(num == 1) sungJuk = new SungJukInsert();
            else if(num == 2) sungJuk = new SungJukPrint();
            else if(num == 3);
            else if(num == 4);
            else if(num == 5);
            else {
            	System.out.println("1~6 중에 선택하세요");
            	continue;
            }
            
            sungJuk.execute(list); //호출
            
		}//while
	}

}





