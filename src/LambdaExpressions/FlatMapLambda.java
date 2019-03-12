package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapLambda {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList ( 1, 2, 3, 4, 5, 6, 7 );
        List<Integer> list2 = Arrays.asList ( 0, 9, 8 );
        List<Integer> list3 = Arrays.asList ( 7, 7, 7 );

        List<List<Integer>> list = Arrays.asList ( list1, list2, list3 );
        //list.forEach ( System.out::println );
        //list.stream ( ).map ( s -> s.size ()).forEach ( System.out::println );
        // Function<List<?>, Integer> funtion = s -> s.size ( );//Function accepts <input <?>unknown , output>
//        Function<List<?>, Integer> funtion = List::size;
//        list.stream ( ).map ( funtion ).forEach ( System.out::println );
        //Creating a flat map
        Function<List<?>, Stream<?>> flatMap = List::stream;
        list.stream ( ).flatMap ( flatMap ).forEach ( System.out::println );

    }
}
