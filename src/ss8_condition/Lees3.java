package ss8_condition;

public class Lees3 {
    public static void main(String[] args) {


        // a ép kiểu độ chính xác kh bị thay đổi
        byte byteValue = 100;
        short shortValue = byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        // b ép kiểu ngược lại câu a
        double doubleValue1 = 100;
        float floatValue1 = (float) doubleValue;
        long longValue1 = (long) floatValue;
        int intValue1 = (int) longValue1;
        short shortValue1 = (short) intValue1;
        byte byteValue2 = (byte) shortValue1;

        // c ép kiểu theo độ chính xác bị thay đổi
        double doubleValue2 = 99999999999999.9;
        float floatValue2 = (float) doubleValue2;
        long longValue2 = (long) floatValue2;
        int intValue2 = (int) longValue2;
        short shortValue2 = (short) intValue2;
        byte byteValue3 = (byte) shortValue2;

    }
}
