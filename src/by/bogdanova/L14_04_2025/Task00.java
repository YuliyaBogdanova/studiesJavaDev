package by.bogdanova.L14_04_2025;

import by.bogdanova.L14_04_2025.impl.AppleGreenColourPredicate;
import by.bogdanova.L14_04_2025.redicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

// java 8
public class Task00 {

    public static void main(String[] args) {

        List<Apple> apples = List.of(
                new Apple(Colour.GREEN, 100),
                new Apple(Colour.RED, 150),
                new Apple(Colour.RED, 200),
                new Apple(Colour.YELLOW, 400)
        );

        List<Apple> apples1 = filterApplesByColour(apples, Colour.GREEN);
        System.out.println(apples1);

        List<Apple> apples2 = filterHeavyApple(apples, 200);
        System.out.println(apples2);

        filterByPredicate(apples, new AppleGreenColourPredicate());

//        filterByPredicate(apples, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return Colour.RED.equals(apple.getColour());
//            }
//        });

        filterByPredicate(apples,
                (Apple apple) -> Colour.YELLOW.equals(apple.getColour()));

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        filterByPredicate(numbers, (Integer i) -> i%2 == 0);
        System.out.println(filterByPredicate(numbers, (Integer i) -> i%2 == 0));


    }

    private static List<Apple> filterApplesByColour(List<Apple> apples, Colour colour) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (colour.equals(apple.getColour())) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterHeavyApple(List<Apple> apples, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterApple(boolean bool, int weight, Colour colour, List<Apple> apples) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : apples) {
            if (bool) {
                if (colour.equals(apple.getColour())) {
                    result.add(apple);
                }
            } else {
                if (apple.getWeight() > weight) {
                    result.add(apple);
                }
            }
        }
        return result;
    }

    private static <T> List<T> filterByPredicate (List<T> smth, ApplePredicate<T> applePredicate){
        List<T> result = new ArrayList<>();
            for (T t : smth) {
                if (applePredicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}