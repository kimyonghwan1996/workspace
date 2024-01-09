package book;

import java.io.IOException;

public class BookMain {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        BookService bookService = new BookService();
        bookService.menu();
        System.out.println("프로그램 종료"); 
    }
    
}
