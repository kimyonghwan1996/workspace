package abstract_;

public abstract class AbstractTest {//POJO형식 (Plain old java object)abstract 필수로 입력
    String name;

    public String getName(){ // 구현
        return name;
    }

    public abstract void setName(String name); //추상 메소드, abstract 필수로 입력
}
