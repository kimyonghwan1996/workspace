package Io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        
        PersonDTO dto = new PersonDTO("홍길동", 25, 183.6);

        //파일 저장
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
        oos.writeObject(dto);
        oos.close();

        //파일 읽기
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
        PersonDTO dto2 = (PersonDTO)ois.readObject();
        System.out.println("이름 = " + dto2.getName() + " 나이 : " + dto2.getAge() +
                            " 키 : " + dto2.getHeight());
        ois.close();
    }
}
