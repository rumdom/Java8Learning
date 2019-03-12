import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println ( "Hello World!" );
        String x = "dghfgdsjhf";
        System.out.println ( x.hashCode ( ) );
        HashMap<Integer, String> lamdaHash = new HashMap<> ( );
        lamdaHash.put ( 1, "test1" );
        lamdaHash.put ( 2, "test1" );
        lamdaHash.put ( 3, "test1" );
        lamdaHash.forEach ( (k, v) -> System.out.println ( "key: " + k + "\nvalue:" + v ) );
    }
}
