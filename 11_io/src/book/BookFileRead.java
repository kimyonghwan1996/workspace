package book;

import java.util.ArrayList;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class BookFileRead implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list) {
        try{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));
        //BookDTO bookDTO = (BookDTO)ois.readObject();
        //ois.readObject(list);
            while (true) {
                try{
                    BookDTO bookDTO = (BookDTO)ois.readObject();
                    list.add(bookDTO);
                }
                catch(EOFException e){
                    break;
                }
            }
            
        ois.close();
        System.out.println("파일에 모든 항목을 로드하였습니다.");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


