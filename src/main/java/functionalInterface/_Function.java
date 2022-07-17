package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int output = incrementByOne(1);
        System.out.println(output);

        int output2 = incrementByOneFunction.apply(1);
        System.out.println(output2);

        int output3 = incrementByOneFunction.andThen(multiplyByTenFunction).apply(1);
        System.out.println(output3);

        int output4 = incrementByOneAndMultiplyByAnotherFunction.apply(1,10);
        System.out.println(output4);
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunction =
            number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByAnotherFunction =
            (number, number2) -> ((number + 1) * number2);

    static int incrementByOne(int number){
        return number + 1;
    }

    static int multiplyByTen(int number){
        return number * 10;
    }

    static int incrementByOneAndMultiplyByAnother(int number, int number2){
        return (number + 1) * number2;
    }
}
