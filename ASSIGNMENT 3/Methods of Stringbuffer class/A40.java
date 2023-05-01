public class A40 {
    public static void main(String[] args) {
        // create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // append() method
        sb.append(" World");
        System.out.println(sb); // output: Hello World

        // capacity() method
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity); // output: Capacity: 21

        // charAt() method
        char ch = sb.charAt(6);
        System.out.println("Character at index 6: " + ch); // output: Character at index 6: W

        // delete() method
        sb.delete(6, 11);
        System.out.println(sb); // output: Hello

        // deleteCharAt() method
        sb.deleteCharAt(3);
        System.out.println(sb); // output: Helo

        // ensureCapacity() method
        sb.ensureCapacity(30);
        System.out.println("Capacity after ensureCapacity(30): " + sb.capacity()); // output: Capacity after ensureCapacity(30): 30

        // getChars() method
        char[] charArray = new char[5];
        sb.getChars(0, 5, charArray, 0);
        System.out.println(charArray); // output: Helo

        // indexOf() method
        int index = sb.indexOf("o");
        System.out.println("Index of 'o': " + index); // output: Index of 'o': 3

        // insert() method
        sb.insert(3, "l");
        System.out.println(sb); // output: Hello

        // length() method
        int length = sb.length();
        System.out.println("Length: " + length); // output: Length: 5

        // setCharAt() method
        sb.setCharAt(3, 'l');
        System.out.println(sb); // output: Helll

        // setLength() method
        sb.setLength(3);
        System.out.println(sb); // output: Hel

        // substring() method
        String str = sb.substring(1);
        System.out.println(str); // output: el

        // toString() method
        String str1 = sb.toString();
        System.out.println(str1); // output: Hel
    }
}

