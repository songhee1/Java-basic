package testCode.polymorphism;


public class InheritancePoly {

    public static void main(String[] args) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintName();
    }

    private void callPrintName() { // 다형성, 실제 호출된 메서드는 원래 객체에 있는 메서드
        Parent parent1 = new Parent(); //parent constructor
        Parent parent2 = new Child(); // parent, child constructor
        Parent parent3 = new ChildOther(); // parent, childother constructor

        parent1.printName(); // parent
        parent2.printName(); // parent
        parent3.printName(); // childOther
    }
}
