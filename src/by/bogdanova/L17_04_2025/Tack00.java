package by.bogdanova.L17_04_2025;

import by.bogdanova.L14_04_2025.Apple;
import by.bogdanova.L14_04_2025.Colour;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Tack00 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list.add("Fedya");
        list.add("Kolya");
        list.add("Petr");



        forEach(list, s -> System.out.println(s));
        forEach(list, s -> list2.add(s + " Ivanenko"));

        list.forEach(s -> System.out.println(s));

        List<Integer> listInt = map(list, l -> l.length());
        System.out.println(listInt);

        List<Apple> listApple = new ArrayList<>();
        List<String> Apple2 = new ArrayList<>();
        listApple.add(new Apple(Colour.GREEN, 100));
        listApple.add(new Apple(Colour.RED, 150));
        listApple.add(new Apple(Colour.RED, 200));

        List<Colour> listColourt = map(listApple, a -> a.getColour());
        System.out.println(listColourt);

        //если работаю только с цифрами
        IntPredicate bool = (int i) -> i % 2 ==0;

        Random r = new Random();
        Supplier<Integer> supplier = () -> r.nextInt(100);
        System.out.println(supplier.get()); // в этот момент выполнит операцию
        // позволяет отложить действие

        // использование локальной переменной для л
        final                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 int a = 10;
        Runnable runnable = () -> System.out.println(a);

        // ссылки на методы
        List<Colour> listColourt1 = map(listApple, Apple::getColour);
        System.out.println(listColourt1);
        List<Integer> listWeight = map(listApple, Apple::getWeight);
        forEach(listWeight, System.out::print);

        // сылка на конструкторы
        Supplier<Apple> s = Apple::new;
        Apple apple = s.get();

        BiFunction<Colour, Integer, Apple> s2 = Apple::new;
        Apple apple1 = s2.apply(Colour.RED, 100);

        listApple.sort((a1, a2) -> Integer.compare(a1.getWeight(), a2.getWeight()));

       Comparator<Apple> comparing = Comparator.comparing((Apple a3) -> a3.getWeight());
        listApple.sort(comparing);
        // то же, что и в 69 строке
        listApple.sort(Comparator.comparing(Apple::getWeight).thenComparing(Apple::getColour));

        Predicate<Apple> predicate = a5 -> a5.getWeight() == 100;
        Predicate<Apple> and = predicate.and(a5 -> Colour.GREEN.equals(a5.getColour()));



    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t: list) {
            c.accept(t);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f){
        List<R> result = new ArrayList<>();
        for (T t: list) {
            result.add(f.apply(t));
        }
        return result;
    }
}
