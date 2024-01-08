package nasted;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractTest at = new AbstractTest(){ //익명 Inner Class

            @Override
            public void setName(String name){
                this.name = name;
            } //구현
            
        };

        //interface 생성
        InterA in = new InterA() {
            @Override
            public void aa(){}
            @Override
            public void bb(){}
        };
        // 추상메소드가 없는 추상 클래스 생성
        AbstractExam ae = new AbstractExam() {

        };
        
    }
}
