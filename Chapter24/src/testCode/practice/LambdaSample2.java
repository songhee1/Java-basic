package testCode.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream().filter(li -> li.contains("a"));

        List<String> list2 = Arrays.asList("a", "b");
        Stream<Boolean> a = list2.stream().map(element -> element.equals("a"));

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4,5);
        Optional<Integer> reduce = list3.stream().reduce((i, j) -> i + j);
        System.out.println(reduce);

        Person p1 = new Person("name", 1, "수원시 xx구...1");
        Person p2 = new Person("name", 1, "수원시 xx구...2");
        Person p3 = new Person("name", 2, "수원시 xx구...");
        List<Person> list4 = Arrays.asList(p1, p2, p3);
        Map<Integer, List<Person>> collect = list4.stream()
            .collect(Collectors.groupingBy(element -> element.age));

        for (Map.Entry<Integer, List<Person>> map : collect.entrySet()) {
            System.out.print(map.getKey()+"|| values = ");
            List<Person> pp = map.getValue();
            for (Person person : pp) {
                System.out.print(person.age+", ");
            }
            System.out.println();
        }
    }

}
class Person{
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
}
