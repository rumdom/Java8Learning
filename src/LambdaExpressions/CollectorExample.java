package LambdaExpressions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorExample {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<> ( );

        InputStreamReader inputStreamReader = new InputStreamReader
                ( CollectorExample.class.getResourceAsStream ( "persons.txt" ) );
        BufferedReader bufferedReader = new BufferedReader ( inputStreamReader );

        Stream<String> stream = bufferedReader.lines ( );

        stream.map ( line -> {
            String[] str = line.split ( " " );
            Person person = new Person ( str[0].trim ( ), Integer.parseInt ( str[1] ) );
            personList.add ( person );
            return person;
        } ).forEach ( System.out::println );
        System.out.println ( "------------------less than 30-----------------" );
        personList.stream ( ).filter ( p -> p.getAge ( ) < 30 ).forEach ( System.out::println );
        System.out.println ( "------------------youngest-----------------" );
        Optional<?> optiMin = personList.stream ( ).min ( Comparator.comparing ( Person::getAge ) );
        System.out.println ( optiMin );
        System.out.println ( "------------------youngest in 30's-----------------" );
        Optional<?> optiMin30 = personList.stream ( ).filter ( s -> s.getAge ( ) >= 30 ).min ( Comparator.comparing ( Person::getAge ) );
        System.out.println ( optiMin30 );
        System.out.println ( "------------------group by age-----------------" );
        Map<Integer, List<Person>> personMap =
                personList.stream ( ).collect ( Collectors.groupingBy ( Person::getAge ) );
        System.out.println ( personMap );
        System.out.println ( "------------------group by age-----------------" );
        Map<Integer, Long> ageAndCountMap =
                personList.stream ( ).collect ( Collectors.groupingBy ( Person::getAge, Collectors.counting ( ) ) );
        System.out.println ( ageAndCountMap );
        System.out.println ( "------------------group by age-----------------" );
        Map<Integer, Set<String>> ageAndNameListMap =
                personList.stream ( ).collect ( Collectors.groupingBy (
                        Person::getAge,
                        Collectors.mapping (
                                Person::getName,
                                Collectors.toCollection ( TreeSet::new ) ) ) );// orders in alphabetical order
        //or Collectors.toList ( ) = gives list of names (or)  Collectors.joining (",")= string joing with "," )
        System.out.println ( ageAndNameListMap );

    }
}
