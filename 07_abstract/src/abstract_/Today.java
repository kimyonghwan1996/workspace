package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {
    public static void main(String[] args) throws ParseException{
        Date d = new Date();
        System.out.println("오늘 날짜 : " + d);
        SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일  HH:mm:ss");
        System.out.println("오늘 날짜 : " + sdf.format(d));

        //생일 1992 07 16 10:25:37 입력

        SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
        Date birth = input.parse("19960807102537");
        System.out.println("오늘 날짜 : " + birth);
        System.out.println("오늘 날짜 : " + sdf.format(birth));

        
        //Calendar cal = new GregorianCalendar(); //추상 클래스 , 서브클래스 이용한 생성
        Calendar cal = Calendar.getInstance(); // 매소드를 이용한 생성
        
        int year = cal.get(Calendar.YEAR);

        int month = cal.get(Calendar.MONTH) + 1;
        
        int week = cal.get(Calendar.DAY_OF_WEEK);
        String dayOfweek = null;
        switch (week) {
            case 1 : dayOfweek = "일요일"; break;
            case 2 : dayOfweek = "월요일"; break;
            case 3 : dayOfweek = "화요일"; break;
            case 4 : dayOfweek = "수요일"; break;
            case 5 : dayOfweek = "목요일"; break;
            case 6 : dayOfweek = "금요일"; break;
            case 7 : dayOfweek = "토요일"; break;
        }
        

        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        

        System.out.println(year + "년 " + month + "월 " + day + "일 "+dayOfweek+ " "+ hour + " : " + minute + " : " + second);
    }    
}
