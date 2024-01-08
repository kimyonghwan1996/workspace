package collection;

public class PersonDTO implements Comparable<PersonDTO>{
    private String name;
    private int age;

    public PersonDTO(){
    
    }

    public PersonDTO(String name, int age){
        //super();
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
            this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public void setName(int age){
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + "\t" + age;
    }

    @Override
    public int compareTo(PersonDTO p) { //기준잡기 , person age로 기준
       /* 오름차순 
        if(this.age < p.age) return -1;
        else if(this.age > p.age) return 1;
        else return 0;
        */
        //내림차순
        if(this.age < p.age) return 1;
        else if(this.age > p.age) return -1;
        else return 0;

    }

    
}
