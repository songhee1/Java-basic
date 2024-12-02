package testCode.staticNested;

public class OuterOfStatic {
    static class StaticNested{ // static nested class, 논리적으로 묶기 위해 사용
        private int value = 0;
        public int getValue(){
            return value;
        }
        public void setValue(int value){
            this.value = value;
        }
    }
}
