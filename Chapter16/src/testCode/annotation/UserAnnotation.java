package testCode.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE}) // 메서드, 클래스에 사용
@Retention(RetentionPolicy.RUNTIME) // 유지정보
public @interface UserAnnotation { // @UserAnnotation
    // 해당 항목에 대한 타입으로 사용
    public int number();
    public String text() default "This is first annotation"; // 어노테이션 사용시 기본값
}
