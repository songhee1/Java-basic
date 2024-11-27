package testCode;

public class ReferenceDefault {
    String instanceVariable;
    public ReferenceDefault(){}
    public ReferenceDefault(String arg){

    }

    public static void main(String[] args) {
        ReferenceDefault reference = new ReferenceDefault();
    }
    public String getString(){
        return instanceVariable;
    }
    public void setString(String str){
        instanceVariable = str;
    }
}
