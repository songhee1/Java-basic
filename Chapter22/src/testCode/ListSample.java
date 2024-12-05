package testCode;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class ListSample {

    public static void main(String[] args) {
        ListSample sample = new ListSample();
        sample.checkArrayList2();
        System.out.println("===");
        sample.checkArrayList3();
        System.out.println("===");
        sample.checkArrayList4();
        System.out.println("===");
        sample.checkArrayList5();
        System.out.println("===");
        sample.checkArrayList6();
        System.out.println("===");
        sample.checkArrayList7();
    }
    public void checkArrayList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0 ");
        list2.addAll(list);
    }
    public void checkArrayList2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        ArrayList<String> list2 = list; // 주소값 전달
        list.add("Oops");
        for (String tempData : list2) {
            System.out.println("List2 "+tempData); // list 데이터 모두 출력
        }
    }
    public void checkArrayList3(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] tempArray = new String[5]; // 배열크기>list 크기, null 채워짐
        String[] strList = list.toArray(tempArray);
        for (String temp : strList) {
            System.out.println(temp);
        }

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("D");
        list2.add("E");
        String[] stringArray = list2.toArray(new String[0]); // null 채워질일 x
        System.out.println(stringArray[0]);
    }
    public void checkArrayList4(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        System.out.println("Removed "+list.remove(0)); // return Element
        for (int loop=0;loop<list.size();loop++) {
            System.out.println("list.get("+loop+") = "+list.get(loop));
        }
    }
    public void checkArrayList5(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        System.out.println("Removed "+list.remove("A")); // return boolean
        for (int loop=0;loop<list.size();loop++) {
            System.out.println("list.get("+loop+") = "+list.get(loop));
        }
    }
    public void checkArrayList6(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        ArrayList<String> temp = new ArrayList<>();
        temp.add("A");
        list.removeAll(temp); // 해당 컬렉션 내 data 삭제

        for (int loop=0;loop<list.size();loop++) {
            System.out.println("list.get("+loop+") = "+list.get(loop));
        }
    }
    public void checkArrayList7(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        System.out.println(list.set(0, "E")); // 해당 위치에 있던 데이터 리턴

    }
}
