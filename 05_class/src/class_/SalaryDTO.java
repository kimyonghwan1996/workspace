package class_;

public class SalaryDTO {
	private String name;
	private String job;
	private int basic;
	private int extra;
	private int total;
	private int salary;
	private int tax;
	private double rate;
	
	
	public void setData(String n,String s, int a, int b) {
		name = n;
		job = s;
		basic = a ;
		extra = b ;
	}
	public void calc() {
		total = basic + extra;
		
		//rat = total>=5000000 ? 0.03 : total>=80 ? 0.02 : : 0.01;
		if(total>=5000000) rate = 0.03 ;
		else if (total>=80) rate = 0.02 ;
		else rate = 0.01 ;
		
		tax = (int)(total*rate);
		salary = total-tax;
		}
	public String getName() {return name ;}
	public String getJob() {return job ;}
	public int getBasic() {return basic ;}
	public int getExtra() {return extra ;}
	public int getTot() {return total ;}
	public double getRate() {return rate ;}
	public double getTax() {return tax ;}
	public double getSal() {return salary ;}

}
