public class InterfaceDemo {
    public static void main(String[] args) {
        FunctionalInterface functionalInterface = () -> System.out.print ( "\ni am showing in class" );
        FunctionalInterface.print ( );
        functionalInterface.show ( );
        functionalInterface.test ( );

    }


}
