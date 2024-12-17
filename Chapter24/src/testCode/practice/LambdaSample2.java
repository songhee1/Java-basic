package testCode.practice;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.print.attribute.IntegerSyntax;

public class LambdaSample2 {

    public static void main(String[] args) {
        Runnable r = ()->{};
        Supplier<Integer> s = ()->1;
        Consumer<Integer> c = i->{};
        Function<Integer, Integer> f = i->i%2;
        Predicate<Integer> p = (i)->false;

        BiConsumer<Integer, Integer> bc = (i, j)->{};
        BiFunction<Integer, Integer, Integer> bf = (i, j) -> i+j;
        BiPredicate<Integer, Integer> bp = (i, j) -> i!=j;
        
    }
}
