package apexsys;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import java.util.*;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class Sample {

    static int p(int n) {
        //System.out.println(n);
        return n;
    }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,4,6,7,8,9,10);
        Set<Integer> l = numbers.stream().filter(n -> n > 3)
                .map(n -> p(n))
                .collect(toSet());
//                .forEach(System.out::println);
    }

}
