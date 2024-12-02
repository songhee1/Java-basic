package testCode.c.practice;

public class UseStringMethods {

    public static void main(String[] args) {
        String test=  "The String class represents character strings";
        UseStringMethods sample = new UseStringMethods();
        sample.printWords(test);
        sample.findString(test, "string");
        sample.findAnyCaseString(test, "string");
        sample.countChar(test, 's');
        sample.printContainWords(test, "ss");
    }
    public void printWords(String str){
        String[] s = str.split(" ");
        for (String string : s) {
            System.out.println(string);
        }
    }

    public void findString(String str, String findStr){
        int index = str.indexOf(findStr);
        System.out.println("string is appeared at "+ index);
    }
    public void findAnyCaseString(String str, String findStr){
        String string = str.toLowerCase();
        int index = string.indexOf(findStr);
        System.out.println("string is appeared at "+index);
    }
    public void countChar(String str, char c){
        char[] charArray = str.toCharArray();
        int count = 0;
        for (char c1 : charArray) {
            if(c1 == c){
                count++;
            }
        }

        System.out.println("char 's' count is "+count);
    }

    public void printContainWords(String str, String findStr){
        boolean contains = str.contains(findStr);
        System.out.println("str contains 'ss' is "+contains);
    }
}
