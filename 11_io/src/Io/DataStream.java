package Io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {
    public static void main(String[] args) throws IOException{
       // DataOutputStream bos = new DataOutputStream(new FileOutputStream("result.txt")); // 버퍼로 입력 파일아웃으로 출력
        //두번의 new,,, 괄호 안 먼저 처리 후 진행
        /**/
        FileOutputStream fos = new FileOutputStream("result.txt"); // 최종목적지
        DataOutputStream bos = new DataOutputStream(fos);

        bos.writeUTF("홍길동");
        bos.writeInt(25);
        bos.writeDouble(185.3);

        bos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("result.txt")); 
        //FileInputStream fis = new FileInputStream(bis);
        //DataInputStream dis = new DataInputStream("result.txt");

        String name = dis.readUTF();
        int age = dis.readInt();
        double height = dis.readDouble();

        System.out.println("이름 : " + name + " 나이 : " 
                            + age + " 키 : " + height);
        dis.close();

    }
}
