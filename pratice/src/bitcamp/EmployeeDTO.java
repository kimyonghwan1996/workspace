package bitcamp;

public class EmployeeDTO implements  Comparable<EmployeeDTO>{
    private int no;
    private String name;
    private String job;
    private int basic;
    private int extra;
    private int tot;    
    private double rate;
    private int tax;
    private int salary;
    
    public EmployeeDTO() { }
    
    public EmployeeDTO(int no, String name,String job, int basic, int extra){
        this.no = no;
        this.name = name;
        this.job = job;
        this.basic = basic;
        this.extra = extra;
    }
    
    public void calc() {
    	tot = basic + extra ;
        rate = tot / 3.0;
        if(tot>4000000) rate = 0.03 ;
		else if (tot>2000000 && tot <= 4000000) rate = 0.02 ;
		else rate = 0.01 ;
		
		tax = (int)(tot*rate);
		salary = (int)tot-tax;
    }

	public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}

	public String getName() {return name;}
    public void setName(String name) {this.name = name;}

	public String getJob() {return job;}
	public void setJob(String job) {this.job = job;}

	public int getBasic() {return basic;}
	public void setBasic(int basic) {this.basic = basic;}

	public int getExtra() {return extra;}
	public void setExtra(int extra) {this.extra = extra;}

	public double getRate() {return rate;}
	public void setRate(double rate) {this.rate = rate;}

	public int getTot() {return tot;}
	public void setTot(int tot) {this.tot = tot;}

    public int getTax() {return tax;}
	public void setTax(int tax) {this.tax = tax;}

    public int getSalary() {return salary;}
	public void setSalary(int salary) {this.salary = salary;}
	
	@Override
	public String toString() {
		return no + "\t\t" 
			 + name + "\t\t"
			 + job + "\t"
			 + basic + "원\t"
			 + extra + "원\t"
			 + tot + "원\t"
             + rate + "%\t"
             + tax + "원\t"
             + salary + "원";
	}
    @Override
    public int compareTo(EmployeeDTO list) {
        if(this.salary < list.salary) return 1;
        else if(this.salary > list.salary) return -1;
        else return 0;
    }


}
