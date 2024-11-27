package testCode;

public class ReferenceReturn {
    public int calculateAfterIntReturn(){
        int returnInt = 0;
        return returnInt;
        returnInt++; //unreachable statement
    }
}
