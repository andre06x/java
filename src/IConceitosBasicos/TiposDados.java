package IConceitosBasicos;/*
 Type    Bit
 Double  64
 Float   32
 Long    64
 Int     32
 Short   16
 Byte    8
 Char    2
 String  ?
 Boolean ?
*/

public class TiposDados {
    public static void main(String[] args) {

        //numeros decimais
        Double numeroDoble = 10.312321313;
        Float numeroFloat =  10.312321313f;

        Long numeroLong = 199999999l;
        Integer numeroInteger = 100;
        Short numeroShprt = 10;
        Byte numeroByte = 19;

        String s = "32131231   ";
        Character c = 'c';

        //JVM
        Boolean b = false;

        System.out.println("Double: Max: " + Double.MAX_VALUE + " - Double: " + Double.MIN_VALUE);
        System.out.println("Float: Max: " + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE);
        System.out.println("Long: Max: " + Long.MAX_VALUE + " - Long: " + Long.MIN_VALUE);
        System.out.println("Integer: Max: " + Integer.MAX_VALUE + " - Min: " + Integer.MIN_VALUE);
        System.out.println("Short: Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE);
        System.out.println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE);
    }
}
