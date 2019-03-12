package LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PeekLambda {

    public static void main(String[] args) {
        {
            Stream<String> streamLambda = Stream.of ( "one", "two", "three", "four" );
            Predicate<String> p1 = s1 -> s1.contains ( "o" );
            Predicate<String> p2 = Predicate.isEqual ( "two" );

            List<String> newList = new ArrayList<> ( );
            // streamLambda.peek ( System.out::println ).sorted ( ).filter ( p1.or ( p2 ) ).peek ( System.out::println );
            streamLambda.peek ( System.out::println ).sorted ( ).filter ( p1.or ( p2 ) ).peek ( newList::add ).forEach ( System.out::println );
            newList.forEach ( System.out::println );
        }
    }
}
