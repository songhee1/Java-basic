package testCode.inner;

public class OuterOfInner {
    class Inner{ // inner class, 캡슐화
        private int value = 0;
        public int getValue(){
            return value;
        }
        public void setValue(int value){
            this.value = value;
        }
    }
}
