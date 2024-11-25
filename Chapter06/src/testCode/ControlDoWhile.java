package testCode;

public class ControlDoWhile {

    public static void main(String[] args) {
        ControlDoWhile cd = new ControlDoWhile();
        cd.doWhile();
    }
    public void doWhile(){
        ControlSwitch controlSwitch = new ControlSwitch();
        int loop = 0;
        do{
            loop++;
            controlSwitch.switchCalendar(loop);
        }while(loop<12); // 적어도 한번 반복문 실행, 세미콜론 필수
    }
}
