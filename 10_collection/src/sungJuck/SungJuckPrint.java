package sungJuck;

import java.util.ArrayList;

public class SungJuckPrint implements SungJuck{
    @Override
    public void execute(ArrayList<SungJuckDTO> list) {
        System.out.println();
        for(SungJuckDTO sungJuckDTO : list){
            System.err.println(sungJuckDTO);
        }

    }
}
