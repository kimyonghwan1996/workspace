package book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class BookSort implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list){
       //Book book = null; //클래스나 인터페이스 초기화는 null
        //int num = 0;
        System.out.println();

        Comparator<BookDTO> com = new Comparator<BookDTO>() { //익명개체
            @Override
            public int compare(BookDTO b1, BookDTO b2){
                return b1.getTitle().compareTo(b2.getTitle())*-1;
            }
        };

        //Collections.sort(list.com);
        list.sort(com);
        /* 
        for(BookDTO bookDTO : list){
            System.out.println(bookDTO);
        }*/

    }
}
