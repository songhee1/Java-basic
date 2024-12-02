package testCode;

public class StringNull {

    public static void main(String[] args) {
        StringNull sample = new StringNull();
//        sample.nullCheck(null);
        System.out.println("===");
        sample.nullCheck2(null);
    }
    public boolean nullCheck(String text){
        int textLength = text.length(); // NullPointerException
        System.out.println(textLength);
        if(text == null){
            return true;
        }
        return false;
    }

    public boolean nullCheck2(String text){
        if(text == null){// null 체크
            return true;
        }

        int textLength = text.length();
        System.out.println(textLength);

        return false;
    }
}
