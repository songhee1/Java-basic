package testCode;

public class ArrayNewFor {

    public static void main(String[] args) {
        if(args.length>0){
            for(String string : args){
                System.out.println(string);
            }
        }
    }
    public void newFor(){
        int[] oneDim = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int data:oneDim){
            System.out.println(data);
        }
    }
    public void twoDimForWithCounter(){
        int [][]twoDim = {{1,2,3}, {4,5,6}};
        int oneCount = 0;
        for(int[] dimArray:twoDim){ // 위치확인불가
            int twoCounter = 0;
            for(int data : dimArray){
                System.out.println(data);
                twoCounter++;
            }
            oneCount++;
        }
    }
}
