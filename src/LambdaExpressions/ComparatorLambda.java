package LambdaExpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

    public static void main(String[] args) {
//        Comparator<String> compo = new Comparator<String> ( ) {
//            @Override
//            public int compare(String o1, String o2) {
//                int i = Integer.compare ( o1.length ( ), o2.length ( ) );
//
//                return i;
//            }
//        };
        //-----------------------or-----------------------------------
//        Comparator<String> compoLambda = (o1, o2) ->
//        {
//            int i = Integer.compare ( o1.length ( ), o2.length ( ) );
//
//            return i;
//        };
        //---------------------------or------------------------------
        //    Comparator<String> compoLambda = (o1, o2) ->Integer.compare ( o1.length ( ), o2.length ( ) );
        //------------------------------or----------------------------
        Comparator<String> compoLambda = String::compareTo;
        List<String> stringArrayList = Arrays.asList ( "as", "fdas", "sdgsdga", "bdf", "xaf", "ha" );
        Collections.sort ( stringArrayList, compoLambda );
        stringArrayList.forEach ( System.out::println );//-----lambda expression

    }
}
