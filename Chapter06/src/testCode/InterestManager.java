package testCode;

public class InterestManager {

    public static void main(String[] args) {
        InterestManager im = new InterestManager();
        int day = 1;
        while(day<=365){
            System.out.println(day+"일 거치시 받는 이자 : "+im.calculateAmount(day, 1000000));
            day++;
        }
        day = 0;
        while(day<=365){
            System.out.println(day+"일 거치시 받는 이자 : " + im.calculateAmount(day, 1000000));
            day+=10;
        }
    }
    public double getInterestRate(int day){
        // 거치기간 90일 이내 : 0.5%
        // 91~180일 이내 : 1%
        // 181~364일 이내 : 2%
        // 365일 : 5.6% 이율

        if(day<=90){
            return 0.5;
        }else if(91<=day && day<=180){
            return 1;
        }else if(181<=day && day<=364){
            return 2;
        }else if(day>=365){
            return 5.6;
        }else{
            return 0;
        }
    }
    public double calculateAmount(int day, long amount){
        return getInterestRate(day)*amount;
    }

}
