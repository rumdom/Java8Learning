package Other;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DateAndTime {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<> ( );
        InputStreamReader inputStreamReader = new InputStreamReader
                ( DateAndTime.class.getResourceAsStream ( "persons.txt" ) );
        BufferedReader bufferedReader = new BufferedReader ( inputStreamReader );

        Stream<String> stream = bufferedReader.lines ( );

        stream.map ( line -> {
            String[] str = line.split ( " " );
            String name = str[0].trim ( );
            Integer year = Integer.parseInt ( str[1] );
            Month month = Month.of ( Integer.parseInt ( str[2] ) ); // you can also use normal int.
            int day = Integer.parseInt ( str[3] );
            Person person = new Person ( name, LocalDate.of ( year, month, day ) );
            personList.add ( person );
            return person;
        } ).forEach ( System.out::println );

        LocalDate now = LocalDate.of ( 2013, 12, 6 );
        personList.stream ( ).forEach ( person -> {
            Period period = Period.between ( person.getDateOfBirth ( ), now );
            System.out.println ( person.getName ( ) + " age in " + now.getYear ( )
                    + " was : " + period.getYears ( ) + " months " + period.getMonths ( ) );

        } );


    }
}
