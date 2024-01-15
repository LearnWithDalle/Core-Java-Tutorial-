public class Buffer {
    public static void main(String[] args) {
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println(stringBuffer.toString());

        // Appending more characters
        stringBuffer.append(" World!");
        System.out.println(stringBuffer.toString());

        // Inserting characters at a specific position
        stringBuffer.insert(6, " Java");
        System.out.println(stringBuffer.toString());

        // Deleting characters
        stringBuffer.delete(5, 11);
        System.out.println(stringBuffer);

        // Displaying the final result
        System.out.println(stringBuffer.toString());
    }
}
