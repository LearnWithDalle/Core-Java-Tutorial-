import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class strmethod {

    public static void main(String[] args) {
        // 1. charAt(int index)
        char charAtIndex = "dalle".charAt(2);
        System.out.println("1. Character at index 2: " + charAtIndex);

        // 2. length()
        int stringLength = "dalle".length();
        System.out.println("2. String length: " + stringLength);

        // 3. format(String format, Object... args)
        String formattedString = String.format("3. Formatted %s: %d", "string", 42);
        System.out.println("3. Formatted String: " + formattedString);

        // 4. format(Locale l, String format, Object... args)
        String formattedStringWithLocale = String.format(Locale.US, "4. Formatted %s: %d", "string", 42);
        System.out.println("4. Formatted String with Locale: " + formattedStringWithLocale);

        // 5. substring(int beginIndex)
        String substringResult = "dalle".substring(1);
        System.out.println("5. Substring from index 1: " + substringResult);

        // 6. substring(int beginIndex, int endIndex)
        String substringWithRange = "dalle".substring(1, 3);
        System.out.println("6. Substring from index 1 to 3: " + substringWithRange);

        // 7. contains(CharSequence s)
        boolean containsResult = "dalle".contains("ll");
        System.out.println("7. Contains 'll': " + containsResult);

        // 8. join(CharSequence delimiter, CharSequence... elements)
        String joinedString = String.join("-", "Java", "is", "fun");
        System.out.println("8. Joined String: " + joinedString);

        // 9. join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
        String joinedIterableString = String.join("/", List.of("Java", "is", "fun"));
        System.out.println("9. Joined Iterable String: " + joinedIterableString);

        // 10. equals(Object another)
        boolean equalsResult = "dalle".equals("dalle");
        System.out.println("10. Equals 'dalle': " + equalsResult);

        // 11. isEmpty()
        boolean isEmptyResult = "dalle".isEmpty();
        System.out.println("11. Is Empty: " + isEmptyResult);

        // 12. concat(String str)
        String concatResult = "dalle".concat(" ghar");
        System.out.println("12. Concatenated String: " + concatResult);

        // 13. replace(char old, char new)
        String replacedChar = "dalle".replace('l', 'x');
        System.out.println("13. Replaced 'l' with 'x': " + replacedChar);

        // 14. replace(CharSequence old, CharSequence new)
        String replacedSequence = "dalle".replace("alle", "ulla");
        System.out.println("14. Replaced 'alle' with 'ulla': " + replacedSequence);

        // 15. trim()
        String trimmedString = "   Spaces at the beginning and end.   ".trim();
        System.out.println("15. Trimmed String: '" + trimmedString + "'");

        // 16. split(String regex)
        String[] splitArray = "Java,is,fun".split(",");
        System.out.println("16. Split String: " + Arrays.toString(splitArray));

        // 17. split(String regex, int limit)
        String[] limitedSplitArray = "Java,is,fun,with,limitations".split(",", 3);
        System.out.println("17. Limited Split String: " + Arrays.toString(limitedSplitArray));

        // 18. intern()
        String internedString = "dalle".intern();
        System.out.println("18. Interned String: " + (internedString == "dalle")); // Should be true

        // 19. indexOf(int ch)
        int indexOfChar = "dalle".indexOf('l');
        System.out.println("19. Index of 'l': " + indexOfChar);

        // 20. indexOf(int ch, int fromIndex)
        int indexOfCharFromIndex = "dalle".indexOf('l', 3);
        System.out.println("20. Index of 'l' starting from index 3: " + indexOfCharFromIndex);

        // 21. indexOf(String substring)
        int indexOfSubstring = "dalle".indexOf("all");
        System.out.println("21. Index of 'all': " + indexOfSubstring);

        // 22. indexOf(String substring, int fromIndex)
        int indexOfSubstringFromIndex = "dalle".indexOf("all", 2);
        System.out.println("22. Index of 'all' starting from index 2: " + indexOfSubstringFromIndex);

        // 23. toLowerCase()
        String lowercaseString = "DaLLe".toLowerCase();
        System.out.println("23. Lowercase String: " + lowercaseString);

        // 24. toLowerCase(Locale l)
        String lowercaseStringWithLocale = "DaLLe".toLowerCase(Locale.US);
        System.out.println("24. Lowercase String with Locale: " + lowercaseStringWithLocale);

        // 25. toUpperCase()
        String uppercaseString = "DaLLe".toUpperCase();
        System.out.println("25. Uppercase String: " + uppercaseString);

        // 26. toUpperCase(Locale l)
        String uppercaseStringWithLocale = "DaLLe".toUpperCase(Locale.US);
        System.out.println("26. Uppercase String with Locale: " + uppercaseStringWithLocale);
    }


   
}

    
