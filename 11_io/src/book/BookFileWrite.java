package book;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class BookFileWrite implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list)  {
        
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));
            for (BookDTO bookDTO : list) {
                oos.writeObject(bookDTO);
            }
            oos.close();
            System.out.println("모든 항목을 파일에 저장");
        }
       // oos.writeObject(list);
       // System.out.println(list);
       //ArrayList<BookDTO> list = new ArrayList<BookDTO>() {}
       catch(IOException e) {
            e.printStackTrace();}
       
    }
}
