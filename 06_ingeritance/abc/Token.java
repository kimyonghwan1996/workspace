package class02;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 개수 = " + st.countTokens());
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken()); // 항목 꺼내고 다음 항목으로 이동
		}
		
		System.out.println("-----------------------------");
		
		String[] ar = str.split(",");
		
		
		for(String data : ar) {
			System.out.println(data);
		}
	}

}
