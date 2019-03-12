@java.lang.FunctionalInterface
interface FunctionalInterface {
    public void show();

    default void test() {
        System.out.print ( "\n I am in default method " );
    }

    public static void print(){
        System.out.print ( "\nI am in print" );
    }
}



