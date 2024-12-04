package testCode.practice;

public class JavaNumber {

    public static void main(String[] args) {
        JavaNumber number = new JavaNumber();
        number.parseLong("r0124");
        number.printOtherBase(1024);
    }
    public long parseLong(String data){
        Long lData = null;
        try{
            lData = Long.parseLong(data);
        }catch(NumberFormatException e){
            System.out.println(data+" is not a number");
            return -1;
        }

        return lData;
    }
    public void printOtherBase(long value){
        System.out.println("Original : "+value);
        System.out.println("Binary : "+Long.toBinaryString(value));
        System.out.println("Hex : "+Long.toHexString(value));
        System.out.println("Octal : "+Long.toOctalString(value));

    }
}
