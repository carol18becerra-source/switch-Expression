package com.example;

public class App {
    static class A {
    }

    static class B {
    }

    public static void main(String[] args) {

        /*
         * Recordando el Pattern Matching con la sentencia if y el operador instanceof
         */

        A objA = new A();
        B objB = new B();

        Object obj = objA;

        if (obj instanceof A varibleA)
            System.out.println("Caso 1");

        else if (obj instanceof B varibleB)
            System.out.println("Caso 2");

        /* Sintaxis y ejemplo de swtch expression */
        // obj = "Hello, World!";
        // obj = 4;
        obj = 3.14;
        String result = switch (obj) {
            case Integer i ->
                "It's an integer: " + i;
            case String s ->
                "It's a string: " + s;
            case Double d ->
                "It's a double: " + d;
            default -> "It's something else";
        };
        System.out.println(result); // Outputs: It's a string: Hello, World!

        /*
         * La causula when en la sentencia switch espression con pattern matching.
         * 
         * Nos permite evaluar condiciones adicionales similarmente a como haciamos
         * con el operador && en la sentencia if con instanceof y pattern matching.
         */

        obj = 42;
        String category = switch (obj) {
            case Integer i when i < 0 -> "Negative integer";
            case Integer i when i > 0 -> "Positive integer";
            case Integer i -> "Zero";
            case String s when s.length() > 5 -> "Long string";
            case String s -> "Short string";
            default -> "Something else";
        };
        System.out.println(category); // Outputs: Positive integer


        /* */
    }
}
