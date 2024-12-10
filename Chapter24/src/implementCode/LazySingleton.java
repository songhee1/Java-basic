package implementCode;

import java.util.Objects;

public class LazySingleton {
    private static LazySingleton singleton;
    private LazySingleton() { }
    public static LazySingleton getSingleton(){
        if(Objects.isNull(singleton)){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
