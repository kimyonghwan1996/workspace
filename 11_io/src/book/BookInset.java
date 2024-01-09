package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookInset implements Book{

    @Override
    public void execute(ArrayList<BookDTO> list) {
        System.out.println();

        Scanner scan = new Scanner(System.in);

        System.out.println("코드 입력 : ");
        String code = scan.next();
        System.out.println("제목 입력 : ");
        String title = scan.next();
        System.out.println("작가 입력 : ");
        String author = scan.next();
        System.out.println("가격 입력 : ");
        int price = scan.nextInt();
        System.out.println("수량 입력 : ");
        int qty = scan.nextInt();

        //int total = price * qty;


        BookDTO bookDTO = new BookDTO(code, title, author, price, qty);
        bookDTO.calc();
        //bookDTO.getTotal(total);

        list.add(bookDTO);
        System.out.println("입력되었습니다");
    }
}