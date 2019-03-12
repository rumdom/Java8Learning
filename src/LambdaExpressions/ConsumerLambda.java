package LambdaExpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {
        List<String> employeeList = Arrays.asList ( "rum", "prak", "koen" );
        ArrayList<String> addedList = new ArrayList<> ( );
        //putting the execution code in consumers
        Consumer<String> consumer = System.out::println;
        Consumer<String> consumerAdd = addedList::add;
        //passing the consumers to the employee list. in which order to execute
        // employeeList.forEach ( consumer.andThen ( consumerAdd ) );

        employeeList.stream ( ).forEach ( consumer.andThen ( consumerAdd ) );
        addedList.forEach ( System.out::println );
        employeeList.stream ( ).limit ( 2 ).sorted ().forEach ( System.out::println );

    }
}
