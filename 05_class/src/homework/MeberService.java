package homework;

import java.util.Scanner;

public class MeberService {

	private MeberDTO[] ar = new MeberDTO[5];
	private Scanner scan = new Scanner(System.in);
	private int count = 0; 

	public MeberDTO[] getAr() {return ar;}
	public void setCount(int count) {this.count = count;}
	public int getCount() {return count;}
		
	
	public int insert(String n, int a, String p, String ad) {
		if (count >= ar.length) {
			System.out.println("가입 불가");
			return - 1;			
		} 
		else{
			System.out.println("이름 입력 : ");
			String name = scan.next();
			System.out.println("나이 입력 : ");
			int age = scan.nextInt();
			System.out.println("전화번호 입력 : ");
			String phone = scan.next();
			System.out.println("주소 입력 : ");
			String address = scan.next();
	
			ar[count] = new MeberDTO(scan, name, age, address, phone);
			count++;
			System.out.println();
			System.out.println("생성 완료");

			return 0; 
		}
	}

	public int list() {
		for (int i = 0; i < count; i++) {
			MeberDTO member = ar[i];
			System.out.println(member.getName() + "\t" + member.getAge() + "\t" + member.getNumber() + "\t" + member.getAddress());
		}
		return 0;
	}
	
	
	public int update() {
		System.out.println("핸드폰 번호 입력 :");
		String phone = scan.next();
	
		for (int i = 0; i < count; i++) {
			if (ar[i].getNumber().equals(phone)) {
				System.out.println("수정 할 이름 입력 :");
				ar[i].setName(scan.next());
				System.out.println("수정 할 핸드폰 입력 :");
				ar[i].setPhone(scan.next());
				System.out.println("수정 할 주소 입력 :");
				ar[i].setAddress(scan.next());
	
				System.out.println("수정");
				return 0;
			}
		}
		System.out.println("찾는 회원이 없습니다");
		return -1;
		
	}
	
	public int delete() {
		System.out.println("핸드폰 번호 입력 :");
		String phone = scan.next();

		for (int i = 0; i < count; i++) {
			if (ar[i].getNumber().equals(phone)) {
				for (int j = i; j < count - 1; j++) {
					ar[j] = ar[j + 1];
				}
				count--;

				System.out.println("삭제 되었습니다");
				return 0;
			}
		}

		System.out.println("찾는 회원이 없습니다");
		return -1;
	}


	public int getInsert() {return insert(null, count, null, null);}
	public int getList() {return list();}
	public int getUpdate() {return update();}
	public int getDelete() {return delete();}
}