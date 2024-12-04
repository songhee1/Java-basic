package testCode.lang;

public class JavaLangSystem {

    public static void main(String[] args) {
        JavaLangSystem sample = new JavaLangSystem();
        sample.systemPropertiesCheck();
        sample.systemEnvCheck();
    }
    public void systemPropertiesCheck(){
        System.out.println("java.version="+System.getProperty("java.version")); // 시스템 속성값 관리
    }
    public void systemEnvCheck(){
        System.out.println("JAVA_HOME="+System.getenv("JAVA_HOME")); // 시스템 환경 값 조회
    }
    public void numberMinMaxElapsedCheck(){
        JavaLangNumber numberSample = new JavaLangNumber();
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        numberSample.numberMinMaxCheck();
        System.out.println("Mili second="+(System.currentTimeMillis()-startTime));
        System.out.println("Nano second="+(System.nanoTime()-startNanoTime));
    }
}
