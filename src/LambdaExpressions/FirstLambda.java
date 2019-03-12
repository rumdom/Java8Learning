package LambdaExpressions;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Arrays;

public class FirstLambda {
    public static void main(String[] args) {
        //anonymous class
//        FileFilter fileFilter = new FileFilter ( ) {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName ( ).endsWith ( "txt" );
//            }
//        };
        FileFilter fileFilter = (pathname1) -> pathname1.getName ( ).endsWith ( "txt" );
        File file = new File ( "C:\\repos" );
        File arr[] = file.listFiles ( fileFilter );
        ArrayList<File> arrayList = new ArrayList<File> ( Arrays.asList ( arr ) );
        arrayList.forEach ( (n) -> System.out.println ( "FileName: " + n.getName ( ) ) );

    }
}
