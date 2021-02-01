
public class Main {
    static int x = 15568; 
    static int y = 16611;
    static int z = 0;

    public static void main(String[] args) {
        reg_to_long(x, y); // Takes only the 4 first bytes (32bits) so needs only the first input.
        reg_to_int(x, y);
        reg_to_real4(x, y);
    }

    public static void util(int x, int y) {
        if (x < 0) {
            x = 0;

        } else if (y < 0) {
            y = 0;
        }
    }

    public static void reg_to_long(int x, int y) { // Long, lower byte first.
        util(x, y);

        int i1 = Integer.valueOf(x).shortValue();
        int i2 = Integer.valueOf(y).shortValue();

        byte lowByte1 = (byte)(i1 & 0xFF);
        byte lowByte2 = (byte)(i2 & 0xFF);

        System.out.println("\nLong conversion 4-byte, low byte 1: " + lowByte1 + " low byte 2: " + lowByte2);
    }

    public static void reg_to_int(int x, int y) { // integer.valueOf(decimal).shortValue() use on register 92 / lower bytes
        util(x, y);

        int i1 = Integer.valueOf(x).shortValue();
        int i2 = Integer.valueOf(y).shortValue();

        if (x == 806) { // If register #92, i.e lower byte first
            byte lowByte = (byte)(i1 & 0xFF);

            System.out.println("#92 Signal is: " + lowByte);
        }
        
        int together = i1 + i2;

        
        System.out.println("\nInteger conversion: " + together);
    }

    public static void reg_to_real4(int x, int y) { // Real4 / Float conversion NOT WORKING
        util(x, y);

        String hexa1 = Integer.toString(x, 16); // Convert decimal to hexadecimal 
        String hexa2 = Integer.toString(y, 16);

        String hexaTotal = hexa1.concat(hexa2); // Add them together (if either of the values are 0 just calculate with the < 0 register value)

        long longBits      = Long.valueOf(hexaTotal, 16).longValue(); // Calculate REAL 4 / IEEE
        double doubleValue = Double.longBitsToDouble(longBits);

        System.out.println("\nREAL-4 conversion: " + hexa1 + " " + hexa2 + " " + hexaTotal + " " + longBits + " " + doubleValue);
    }
}