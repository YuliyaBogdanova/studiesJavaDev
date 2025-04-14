package by.bogdanova.L14_04_2025.impl;

import by.bogdanova.L14_04_2025.Apple;
import by.bogdanova.L14_04_2025.Colour;
import by.bogdanova.L14_04_2025.redicate.ApplePredicate;

public class AppleGreenColourPredicate implements ApplePredicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return Colour.GREEN.equals(apple.getColour());
    }
}
