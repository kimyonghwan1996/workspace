package nasted;

public abstract class AbstractTest { //디폴트로 잡을예정, POJO
    String name;

    public String getName() {
        return name;
    }

    public abstract void setName(String name); //추상메소드 (키워드 필수)
    

}
