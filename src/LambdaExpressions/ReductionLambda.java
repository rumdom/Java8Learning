package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionLambda {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList ( 1, 2, 3, 3, 4, 55, 6 );
        Integer sum = list.stream ( ).reduce ( 0, Integer::sum ); // identity element is the initialization
        // if you give more than 0 then it will sum+identity
        Integer max = list.stream ( ).reduce ( 65, Integer::max );
        //or
        Optional<Integer> optional = list.stream ( ).reduce ( Integer::max );
        System.out.println ( optional );


    }
}
