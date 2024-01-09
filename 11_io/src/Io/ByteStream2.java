package Io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream2 {
    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
        
        //파일크기만큼배열잡음
        int size = (int)file.length(); //파일의 크기
        byte[] ar = new byte[size];

        //파일 내용 읽기
        bis.read(ar, 0, size); //0부터 사이즈까지 부르기
        
        System.out.println(new String(ar));
        bis.close();
    }
}
