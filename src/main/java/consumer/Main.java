package consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        printNumber(1);
        printNumberFunction.accept(1);
        printBothNumbers(1,2);
        printBothNumbersFunction.accept(1,2);
    }

    private static void printNumber(int number){
        System.out.println("Input number is "+number);
    }

    private static Consumer<Integer> printNumberFunction =
            number -> System.out.println("Input number is "+number);

    private static void printBothNumbers(int number1, int number2){
        System.out.println(String.format("Input numbers are %s, %s",number1, number2));
    }

    private static BiConsumer<Integer, Integer> printBothNumbersFunction =
            (number1, number2) -> System.out.println(String.format("Input numbers are %s, %s",number1, number2));
}
