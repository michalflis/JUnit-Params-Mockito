package Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersDivisibleByThree {

    public static void main(String[] args) {

        getNumbersDivisibleByThree(0, 30);

    }


    public static List<Integer> getNumbersDivisibleByThree(Integer lowerLimit, Integer upperLimit) {

        IntStream ints = IntStream.range(lowerLimit, upperLimit);

        List<Integer> list = ints.filter(i -> i % 3 == 0)
                .boxed()
                .collect(Collectors.toList());

        list.forEach(System.out::println);
        return list;

    }

}
