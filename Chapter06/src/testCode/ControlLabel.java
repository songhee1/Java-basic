package testCode;

public class ControlLabel {

    public static void main(String[] args) {
        ControlLabel cl = new ControlLabel();
        cl.printTimesTable();
    }
    public void printTimesTable(){
        startLabel:
        for(int i=2;i<10;i++){
            if(i == 4) continue;
            for(int j=1;j<10;j++){
                if(j == 4) continue startLabel; // startLabel 선언지점 이동
                System.out.println(i+" * "+j+" = " + i*j);
            }
            System.out.println();
        }
    }
}
