package testCode.deprecated;

public class AnnotationSample {

    @SuppressWarnings("deprecation")
    public void useDeprecated(){
        AnnotationDeprecated child = new AnnotationDeprecated();
        child.noMoreUse(); // deprecated method 컴파일에러
    }
}
