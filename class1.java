public class class1{
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = intValue;
        System.out.println("(int to double): " + doubleValue);
        double doubleValue1 = 45.5;
        int intValue1 = (int) doubleValue1;
        System.out.println(" (double to int): " + intValue1);
        int intValue2 = 35;
        char charValue2 = (char) intValue2;
        System.out.println("(int to char): " + charValue2);
        int intValue3 = 175;
        byte byteValue3 = (byte) intValue3;
        System.out.println(" (int to byte): " + byteValue3);
        int intValue4 = 1200;
        short shortValue4 = (short) intValue4;
        System.out.println(" (int to short): " + shortValue4);
    }
}