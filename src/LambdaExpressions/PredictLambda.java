package LambdaExpressions;

import java.util.function.Predicate;

public class PredictLambda {

    public static void main(String[] args) {
        String x = "test";
        Predicate<String> p1 = s -> s.equals ( "x" );
        Predicate<String> p2 = s -> s.equals ( "test" );

        Predicate<String> p3 = p1.or ( p2 );

        Predicate<String> p4 = Predicate.isEqual ( p2);

        boolean m = p3.or ( p4 ).test ( x );

        System.out.println ( m );

    }
}
