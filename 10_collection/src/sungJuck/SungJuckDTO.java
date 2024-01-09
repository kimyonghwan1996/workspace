package sungJuck;


public class SungJuckDTO implements  Comparable<SungJuckDTO>{
    private int no;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private double avg;

    public SungJuckDTO(){} 

    public SungJuckDTO(int no,String name, int kor, int eng, int math){
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getNo(){return no;}
    public void setNo(int no){this.no = no;}

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setKor(int kor){this.kor = kor;}
    public int getKor(){return kor;}

    public void setEng(int eng){this.eng = eng;}
    public int getEng(){return eng;}

    public void setMath(int math){this.math = math;}
    public int getMath(){return math;}


    public void calc(){
        tot = kor + eng + math;
        avg = (double)tot / 3; 
    }
    public void setTot(int tot){this.tot = tot;}
    public int getTot(){return tot;}

    public void setAvg(double avg){this.avg = avg;}
    public double getAvg(){return avg;}
    
    
    
    @Override
    public String toString() {
        return no + "\t"  + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" +
                 tot + "\t" + String.format("%.2f",avg);
    } //주소값을 문자로

    @Override
    public int compareTo(SungJuckDTO list) {
        if(this.tot < list.tot) return 1;
        else if(this.tot > list.tot) return -1;
        else return 0;
    }
    /* 
    @Override
    public int compareTo(SungJukDTO sungJukDTO) {       // 총점으로 내림차순
        if(this.tot > sungJukDTO.tot) return -1;
        else if(this.tot < sungJukDTO.tot) return 1;
        else return 0;
    }*/
    /* 
    @Override
    public int compareTo(SungJuckDTO list) {
        if(this.name < list.name) return -1;
        else if(this.name > lilist.name) return -1;
        else return 0;
    }
   */

}
