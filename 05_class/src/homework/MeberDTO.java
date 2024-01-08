package homework;

import java.util.Scanner;

public class MeberDTO {

    private Scanner scan;
    private String name = null;
    private int age;
    private String address = null;
    private String number = null;

    public void setName(String name) {this.name = name;}
    public void setPhone(String number) {this.number = number;}
    public void setAddress(String address) {this.address = address;}

    public MeberDTO(Scanner scanner,String name, int age, String address, String number) {
        this.scan = scanner;
        this.name = name;	
        this.age = age;
        this.address = address;
        this.number = number;
    }

    public Scanner getScanner() {return scan;}
	public String getName() {return name;}
	public int getAge() {return age;}
    public String getAddress() {return address;}
	public String getNumber() {return number;}	


    @Override
    public String toString() {
        return name + "\t" + age + "\t" + number + "\t" + address ;
    }
}