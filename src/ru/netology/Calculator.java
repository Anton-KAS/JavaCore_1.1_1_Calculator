package ru.netology;

import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;

    public BinaryOperator<Integer> plus = (x, y) -> x + y;
    public BinaryOperator<Integer> minus = (x, y) -> x - y;
    public BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //public BinaryOperator<Integer> devide = (x, y) -> x / y; - Версия кода из описания задачи, при y = 0, ошибка, на ноль делить нельзя
    public BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;
    // При равенстве делителя 0, выводим ноль, что, конечно не совсем верно,
    // но как в тернарном операторе реализовать другое (выдачу исключения, например), не ясно

    public UnaryOperator<Integer> pow = x -> x * x;
    public UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    public Predicate<Integer> isPositive = x -> x > 0;

    public Consumer<Integer> println = System.out::println;

}
