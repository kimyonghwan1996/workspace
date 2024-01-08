package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
	// @SuppressWarnings("all")
	public static void main(String[] args) {
		Collection coll = new ArrayList(); // superonterface,

		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); //중복허용, 순서대로 입력됨
		coll.add(25);
		coll.add(3.14);
		coll.add("기린");
		coll.add("코끼리");

		System.out.println(coll);

		Iterator it = coll.iterator();

		
		while(it.hasNext()){
			System.out.println();
		} //항목을 꺼내서 버퍼(임시저장소)에 저장 후 다음 항목으로 이동

		it.next();

	}

}
