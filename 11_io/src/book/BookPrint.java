package book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BookPrint implements Book{
    @Override
    public void execute(ArrayList<BookDTO> list) {
        System.out.println();
        System.out.println("코드\t제목\t작가\t가격\t수량\t총액" );

        List<BookDTO> totlist = new ArrayList<BookDTO>();
        Iterator<BookDTO> it = list.iterator();
        int i;


        while(it.hasNext()){
            BookDTO bookDTO = it.next();

            for(i = 0; i<totlist.size(); i++){
                if (totlist.get(i).getCode().equals(bookDTO.getCode())) {
                    int plus =totlist.get(i).getQty() + bookDTO.getQty();
                    totlist.get(i).setQty(plus);
                    totlist.get(i).calc();
                    break;
                }

            }
            if (i == totlist.size()) {
                totlist.add(bookDTO);
            }

        }

        for(BookDTO bookDTO : totlist){
            System.out.println(bookDTO);
            totlist.clear();
        }
        //totlist.clear();




/* 
        for(BookDTO bookDTO : list){
            System.out.println(bookDTO);
            for(BookDTO bookDTO :totlist){
                if(bookDTO.getCode() == totlist ){
                bookDTO.getQty() += bookDTO.getQty();
                bookDTO.getTotal() += bookDTO.getTotal();
                }
            }
          
            

        }
*/







/* 
        Map<String, BookDTO> mergedMap = new HashMap<>();
    for (BookDTO bookDTO : list) {
        if (mergedMap.containsKey(bookDTO.getCode())) {
            BookDTO existingDTO = mergedMap.get(bookDTO.getCode());
            existingDTO.setQty(existingDTO.getQty() + bookDTO.getQty());
            existingDTO.setTotal(existingDTO.getTotal() + bookDTO.getTotal());
        } else {
            mergedMap.put(bookDTO.getCode(), bookDTO);
        }
    }
    List<BookDTO> mergedList = new ArrayList<>(mergedMap.values());
    
    for (BookDTO mergedDTO : mergedList) {
        System.err.println(mergedDTO);
    }*/
    


    }
}
