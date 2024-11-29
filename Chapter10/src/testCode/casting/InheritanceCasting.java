package testCode.casting;

public class InheritanceCasting {

    public static void main(String[] args) {
        InheritanceCasting inheritance = new InheritanceCasting();
//        inheritance.objectCast(); 불가
//        inheritance.objectCast2(); 실제 객체면 가능
        inheritance.objectCastArray(); // child-parent-child
    }

    private void objectCast() {
        ParentCasting parent = new ParentCasting();
        ChildCasting child = new ChildCasting();

        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting) parent; // 컴파일 에러,classcastException
    }

    public void objectCast2(){
        ChildCasting child = new ChildCasting();
        ParentCasting parent2 = child;
        ChildCasting child2 = (ChildCasting)parent2;
    }
    public void objectCastArray(){ // 부모 클래스 타입 배열
        ParentCasting[] parentArray = new ParentCasting[3];
        parentArray[0] = new ChildCasting();
        parentArray[1] = new ParentCasting();
        parentArray[2] = new ChildCasting();
//        objectTypeCheck(parentArray); parent-child-parent
        objectTypeCheck2(parentArray); // parent-parent-parent, 잘못된 instanceof사용
    }

    public void objectTypeCheck(ParentCasting[] parentArray){ // instanceof 타입확인
        for(ParentCasting tempParent : parentArray){
            if(tempParent instanceof ChildCasting){
                System.out.println("ChildCasting");
                ChildCasting tempChild = (ChildCasting) tempParent; // 명시적 형변환
                tempChild.printAge();
            }else if(tempParent instanceof ParentCasting){
                System.out.println("ParentCasting");
            }
        }
    }

    public void objectTypeCheck2(ParentCasting[] parentArray){ // instanceof 타입확인
        for(ParentCasting tempParent : parentArray){
            if(tempParent instanceof ParentCasting){
                System.out.println("ParentCasting");
            }
            else if(tempParent instanceof ChildCasting){
                System.out.println("ChildCasting");
                ChildCasting tempChild = (ChildCasting) tempParent; // 명시적 형변환
                tempChild.printAge();
            }
        }
    }
}
