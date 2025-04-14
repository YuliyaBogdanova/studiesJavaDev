package by.bogdanova.L14_04_2025.redicate;

import by.bogdanova.L14_04_2025.Apple;

@FunctionalInterface
public interface ApplePredicate <T> {

    boolean test(T t);
}
