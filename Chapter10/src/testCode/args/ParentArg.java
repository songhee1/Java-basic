package testCode.args;

import testCode.inheritance.InheritancePrint;

public class ParentArg {
    public ParentArg(String name){
        System.out.println("ParentArg("+name+") Constructor");
    }
    public ParentArg(InheritancePrint obj){
        System.out.println("ParentArg(InheritancePrint) Constructor");
    }
    public void printName(){
        System.out.println("printName() - ParentArg");
    }
}
