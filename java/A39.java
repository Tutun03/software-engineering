public class A39 {
    public static void main(String[] args) {
        // Creating a string using string literal
        String str1 = "Hello World";

        // Creating a string using String constructor
        String str2 = new String("Hello World");

        // Demonstrating immutable strings
        String str3 = "Hello";
        String str4 = str3.concat(" World");
        System.out.println("str3: " + str3); // Output: str3: Hello
        System.out.println("str4: " + str4); // Output: str4: Hello World

        // Demonstrating mutable strings
        StringBuilder str5 = new StringBuilder("Hello");
        str5.append(" World");
        System.out.println("str5: " + str5); // Output: str5: Hello World

        // Demonstrating methods of the String class
        System.out.println("charAt(1): " + str1.charAt(1)); // Output: charAt(1): e
        System.out.println("compareTo(str2): " + str1.compareTo(str2)); // Output: compareTo(str2): 0
        System.out.println("equals(str2): " + str1.equals(str2)); // Output: equals(str2): true
        System.out.println("equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2)); // Output: equalsIgnoreCase(str2): true
        System.out.println("indexOf('o'): " + str1.indexOf('o')); // Output: indexOf('o'): 4
        System.out.println("length(): " + str1.length()); // Output: length(): 11
        System.out.println("substring(6): " + str1.substring(6)); // Output: substring(6): World
        System.out.println("toCharArray(): " + str1.toCharArray()); // Output: toCharArray(): [C@6d06d69c
        System.out.println("toLowerCase(): " + str1.toLowerCase()); // Output: toLowerCase(): hello world
        System.out.println("toUpperCase(): " + str1.toUpperCase()); // Output: toUpperCase(): HELLO WORLD
        System.out.println("trim(): " + str1.trim()); // Output: trim(): Hello World
        System.out.println("valueOf(10): " + String.valueOf(10)); // Output: valueOf(10): 10
        System.out.println("toString(): " + str1.toString()); // Output: toString(): Hello World
    }
}
