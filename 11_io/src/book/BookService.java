package book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * 메뉴
 * 출력
 * 파일저장
 * 파일읽기
 * 정렬(제목 내림차순)
 * 종료
 * 
 * 조건
 * 1. book01 자바 김자바 가격~ 수량~ 
 * 2. book01 스프링 이봄 가격~ 수량~ 
 * 3. book01 자바 김자바 가격~ 수량~
 * 4. book01 자바 김자바 가격~ 수량~ (중복허용, 출력할때는 같은데이터는 묶어서 출력) 
 */
public class BookService {
    private ArrayList<BookDTO> list= new ArrayList<BookDTO>(); //or List도 가능
    //private Collection<BookDTO> c = new ArrayList<BookDTO>();

    public void menu() throws ClassNotFoundException, IOException{
        Scanner scan = new Scanner(System.in);
        
        Book book = null; //클래스나 인터페이스 초기화는 null
        int num = 0;


        while (true) {
            System.out.println();
            System.out.println("**********************");
            System.out.println("    1. 입력");
            System.out.println("    2. 출력");
            System.out.println("    3. 파일 저장");
            System.out.println("    4. 파일 읽기");
            System.out.println("    5. 정렬(책 제목 내림차순)");
            System.out.println("    6. 끝");
            System.out.println("**********************");
            num = scan.nextInt();

            if (num == 6) break;
            if (num == 1) book = new BookInset(); 
            else if (num == 2) book = new BookPrint();
            else if (num == 3) book = new BookFileWrite();
            else if (num == 4) book = new BookFileRead();
            else if (num == 5) book = new BookSort();
            else {System.out.println("1~6 중에 선택하세요");
            	continue;}
            
            book.execute(list);
            System.out.println();

        }
    }


}