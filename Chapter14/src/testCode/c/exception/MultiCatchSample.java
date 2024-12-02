package testCode.c.exception;

public class MultiCatchSample {

    public static void main(String[] args) {
        MultiCatchSample sample = new MultiCatchSample();
        sample.multiCatch();
        System.out.println("---");
        sample.multiCatchThreeWithNull();
        System.out.println("---");
        sample.multiNoCatch();
    }
    public void multiCatch(){
        int[] intArray = new int[5]; // 배열 초기화시 각 타입 기본값 할당
        try{
            System.out.println(intArray[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured"); // 실행
        }catch(Exception e){
            System.out.println(intArray.length);
        }
    }

   /* public void multiCatchOrderChange(){
        int[] intArray = new int[5]; // 배열 초기화시 각 타입 기본값 할당
        try{
            System.out.println(intArray[5]);
        }catch(Exception e){ // 모두 예외 처리
            System.out.println(intArray.length);
        } catch(ArrayIndexOutOfBoundsException e){ // 컴파일 에러
            System.out.println("ArrayIndexOutOfBoundsException occured"); // 실행
        }
    }*/

    public void multiCatchThree(){
        int[] intArray = new int[5];
        try{
            System.out.println(intArray[5]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured"); // 출력
        }catch(Exception e){
            System.out.println(intArray.length);
        }
    }
    public void multiCatchThreeWithNull(){
        int[] intArray = new int[5];
        try{
            intArray = null;
            System.out.println(intArray[5]); // 1. 객체가 null인지 확인 2. 해당 index 값 확인
        }catch(NullPointerException e){
            System.out.println("NullPointerException occured"); // 출력
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
        }catch(Exception e){
            System.out.println(intArray.length);
        }
    }

    public void multiNoCatch(){
        int[] intArray = new int[5];
        try{
            intArray = null;
            System.out.println(intArray[5]); // 1. 객체가 null인지 확인 2. 해당 index 값 확인
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
        }

        //예외로그 발생
    }
}
