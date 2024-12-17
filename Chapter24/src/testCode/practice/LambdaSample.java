package testCode.practice;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaSample {

    public static void main(String[] args) {
        //예시1
        // (1) 익명클래스 사용
        Funcational_Area_1 area_obj = new Funcational_Area_1() {
            @Override
            public void area(double x, double y, int type) {
                System.out.println("가로:"+x+", 세로:"+y);
            }
        };

        area_obj.area(10.5,5.5,1);

        // (2) 람다식 사용
        Funcational_Area_1 lambda_area_obj = (x,y,type)->{
            //@Override 재정의x
            System.out.println("가로:"+x+", 세로:"+y);
        };

        //예시2
        // (1) 익명클래스 사용
        Funcational_Operator_1 operator_obj = new Funcational_Operator_1() {
            @Override
            public double operator(double a, double b, String type) {
                double result = 0.0;
                switch(type){
                    case "+":
                        result = a+b;
                        break;
                    case "-":
                        result = a-b;
                        break;
                    case "*":
                        result = a*b;
                        break;
                    case "/":
                        result = a/b;
                        break;
                }
                return result;
            }
        };
        double opr_result = operator_obj.operator(10.0, 11.0, "+");
        System.out.println(opr_result);

        // (2) 람다식 사용
        Funcational_Operator_1 lambda_operator_obj = (a,b,type)->{
            //@Override 재정의x
            double result = 0.0;
            switch(type){
                case "+":
                    result = a+b;
                    break;
                case "-":
                    result = a-b;
                    break;
                case "*":
                    result = a*b;
                    break;
                case "/":
                    result = a/b;
                    break;
            }
            return result;
        };

    }
}

@FunctionalInterface // 함수형 인터페이스
interface Funcational_Area_1{
    void area(double x, double y, int type); // 추상메서드가 하나
}

@FunctionalInterface
interface Funcational_Operator_1{
    double operator(double a, double b, String type);
}
