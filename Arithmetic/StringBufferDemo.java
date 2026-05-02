public class StringBufferDemo {
    public static void main(String[] args) {

        // Create StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // 1. append()
        sb.append(" World");
        System.out.println("After append(): " + sb);  // Hello World

        // 2. insert()
        sb.insert(6, "Java ");
        System.out.println("After insert(): " + sb);  // Hello Java World

        // 3. replace()
        sb.replace(6, 10, "C++");
        System.out.println("After replace(): " + sb);  // Hello C++ World

        // 4. delete()
        sb.delete(6, 9);
        System.out.println("After delete(): " + sb);  // Hello + World

        // 5. reverse()
        sb.reverse();
        System.out.println("After reverse(): " + sb);  // dlroW + olleH
    }
}