package implementCode;

import java.util.Objects;

public class Singleton {
    private static Singleton singleton;
    // 클래스 로딩되면서 사용할 수 있게 됨
    private Singleton(){} // 외부에서 생성하지 못하게 한다.
    public Singleton getInstance(){
        if(Objects.isNull(singleton)){
            singleton = new Singleton();
        }
        return singleton;
    }
}
