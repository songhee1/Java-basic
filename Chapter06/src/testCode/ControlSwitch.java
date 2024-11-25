package testCode;

public class ControlSwitch {

    public static void main(String[] args) {
        ControlSwitch cs = new ControlSwitch();
        cs.switchStatement(1); // 1~3 실행
        cs.switchStatement(2); // 2~3 실행
        cs.switchStatement(3);
        cs.switchStatement(4);
        cs.switchStatement(5);
    }
    public void switchStatement(int numberOfWheel){
        switch (numberOfWheel){ // 비교대상
            case 1:
                System.out.println(numberOfWheel+"It is one foot bicycle");
//                break;
            case 2 :
                System.out.println(numberOfWheel+"It is a motor cycle or bicycle");
//                break;
            case 3:
                System.out.println(numberOfWheel+"It is a three wheel car");
                break;
            case 4:
                System.out.println(numberOfWheel+"It is a car");
                break;
            default:
                System.out.println(numberOfWheel+"It is an expensive car");
                break;
        }
    }

    public void switchCalendar(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month+" has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+" has 30 days");
                break;
            case 2:
                System.out.println(month + " has 28 days");
                break;
            default:
                System.out.println(month+" is not a month");
                break;
        }
    }


}
