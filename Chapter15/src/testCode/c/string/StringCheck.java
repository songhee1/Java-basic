package testCode.c.string;

public class StringCheck {

    public static void main(String[] args) {
        StringCheck sample = new StringCheck();
        String[] address = {
            "서울시 구로구 신림동",
            "경기도 성남시 분당구 정자동 개발공장",
            "서울시 구로구 개봉동"
        };
        sample.checkAddress(address);
        System.out.println("===");
        sample.containsAddress(address);
        System.out.println("===");
        sample.checkMatch();
    }

    public void checkAddress(String[] address){
        int startCount = 0;
        int endCount = 0;

        for (String s : address) {
            if(s.startsWith("서울시")){
                startCount++;
            }
            if(s.endsWith("동")){
                endCount++;
            }
        }

        System.out.println("Start with 서울시 count is "+ startCount);
        System.out.println("End with 동 count is "+ endCount);
    }

    public void containsAddress(String[] address){
        int containCount = 0;
        for (String s : address) {
            if(s.contains("구로구")){
                containCount++;
            }
        }
        System.out.println("contain count is "+containCount);
    }

    public void checkMatch(){
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";

        //모두 true
        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(5, compare1, 0, 2));
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
    }
}
