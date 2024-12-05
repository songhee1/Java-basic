package testCode.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ManageHeight {
    private ArrayList<ArrayList<Integer>> gradeHeight = new ArrayList<>();
    public static void main(String[] args) {
        ManageHeight manage = new ManageHeight();
        manage.setGradeHeight(new ArrayList<>());
        ArrayList<Integer> class1 = new ArrayList<>();
        class1.add(170);
        class1.add(180);
        class1.add(173);
        class1.add(175);
        class1.add(177);
        manage.setGradeHeight(class1);

        ArrayList<Integer> class2 = new ArrayList<>();
        class2.add(160);
        class2.add(165);
        class2.add(167);
        class2.add(186);
        manage.setGradeHeight(class2);

        ArrayList<Integer> class3 = new ArrayList<>();
        class3.add(158);
        class3.add(177);
        class3.add(187);
        class3.add(176);
        manage.setGradeHeight(class3);

        ArrayList<Integer> class4 = new ArrayList<>();
        class4.add(173);
        class4.add(182);
        class4.add(181);
        manage.setGradeHeight(class4);

        ArrayList<Integer> class5 = new ArrayList<>();
        class5.add(170);
        class5.add(180);
        class5.add(165);
        class5.add(177);
        class5.add(172);
        manage.setGradeHeight(class5);

        for(int i=1;i<6;i++){
            manage.printHeight(i);
            manage.printAverage(i);
        }
    }

    public void setGradeHeight(ArrayList<Integer> classGradeHeight) {
        this.gradeHeight.add(classGradeHeight);
    }
    public void printHeight(int classNo){
        ArrayList<Integer> list = gradeHeight.get(classNo);
        System.out.println("classNo : "+classNo);
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println();
    }

    public void printAverage(int classNo){
        ArrayList<Integer> list = gradeHeight.get(classNo);
        double sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("classNo : "+ classNo +" average is "+ sum/list.size());
    }

}
