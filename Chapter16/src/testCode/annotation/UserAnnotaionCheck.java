package testCode.annotation;

import java.lang.reflect.Method;

public class UserAnnotaionCheck {

    public static void main(String[] args) {
        UserAnnotaionCheck sample = new UserAnnotaionCheck();
        sample.checkAnnotaions(UserAnnotationSample.class);
    }
    public void checkAnnotaions(Class useClass){
        //Class, Method : Reflection API
        Method[] methods = useClass.getDeclaredMethods(); // 메서드 목록
        for (Method tempMethod : methods) {
            UserAnnotation annotation = tempMethod.getAnnotation(UserAnnotation.class); // 어노테이션 확인
            if(annotation != null){
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(tempMethod.getName()+"() : number = "+number+", text : "+text);
            }else{
                System.out.println(tempMethod.getName()+"() : annotation is null");
            }
        }
    }
}
