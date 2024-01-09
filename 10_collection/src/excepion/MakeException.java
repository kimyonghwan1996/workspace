package excepion;

public class MakeException extends Exception{ // 사용자가 만든 excepion클래스
    private String msg;
    public MakeException(){}

    public MakeException(String msg){
        super();
        this.msg = msg;

    }

    @Override
    public String toString(){
        return msg;
    }
}

