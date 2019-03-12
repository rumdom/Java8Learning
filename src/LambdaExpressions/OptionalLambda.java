package LambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalLambda {
    public static void main(String[] args) {


        List<?> list = Arrays.asList ( "q", "", "sds", "" );
        Optional<?> optionalString = Optional.empty ( );//? because we are using STreams
        Stream book = Stream.of ( "v", "vf" ,"");
        String x = "java";

        optionalString = Optional.ofNullable ( book );
        if (optionalString.isPresent ( )) {
            //System.out.println ( optionalString.get () );
            book.forEach ( System.out::println );
        }


    }
}
