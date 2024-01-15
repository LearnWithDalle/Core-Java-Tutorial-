public class Constracter {

    public static void main(String[] args) {
        // 1. String()
        String emptyString = new String();
        System.out.println("1. Empty String: '" + emptyString + "'");

        // 2. String(String value)
        String copiedString = new String("Copy me!");
        System.out.println("2. Copied String: '" + copiedString + "'");

        // 3. String(char[] value)
        char[] charArray = { 'H', 'e', 'l', 'l', 'o' };
        String charArrayString = new String(charArray);
        System.out.println("3. Char Array String: '" + charArrayString + "'");

        // 4. String(char[] value, int begin, int count)
        String subCharArrayString = new String(charArray, 0, 3);
        System.out.println("4. Sub Char Array String: '" + subCharArrayString + "'");

        // 5. String(byte[] value)
        byte[] byteArray = { 72, 101, 108, 108, 111 };
        String byteArrayString = new String(byteArray);
        System.out.println("5. Byte Array String: '" + byteArrayString + "'");

        // 6. String(byte[] value, int offset, int length)
        String subByteArrayString = new String(byteArray, 1, 3);
        System.out.println("6. Sub Byte Array String: '" + subByteArrayString + "'");

        // 7. String(StringBuffer buffer)
        StringBuffer stringBuffer = new StringBuffer("StringBuffer");
        String stringBufferString = new String(stringBuffer);
        System.out.println("7. StringBuffer String: '" + stringBufferString + "'");

    }
}