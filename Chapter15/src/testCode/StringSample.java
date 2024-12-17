package testCode;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class StringSample {

    public static void main(String[] args) {

        StringSample sample = new StringSample();
        sample.convertUTF16();

    }
    public void convertUTF16(){
        try {
            String korean = "한글";
            printByteArray(korean.getBytes()); // UTF-8 로 기본설정되어있으면 잘 변환

            byte[] array1 = korean.getBytes("UTF-16");
            System.out.println();
            String korean2 = new String(array1,"UTF-16"); // 변환했던 charset로 변환필요
            System.out.println(korean2);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void printByteArray(byte[] array) {
        for (byte b : array) {
            System.out.print(b+" ");
        }
        System.out.println();
    }
}
