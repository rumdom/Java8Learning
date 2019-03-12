package LambdaExpressions;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamLambda {
    public static void main(String[] args) {
        Stream<String> streamLambda = Stream.of ( "one", "two", "three", "four" );
        Predicate<String> p1 = s1 -> s1.contains ( "o" );
        Predicate<String> p2 = Predicate.isEqual ( "two" );
        //streamLambda.sorted ( ).filter ( p1.or ( p2 ) ).forEach ( System.out::println );

        streamLambda.peek ( System.out::println ).sorted ( ).filter ( p1.or ( p2 ) ).forEach ( System.out::println );
    }
}
