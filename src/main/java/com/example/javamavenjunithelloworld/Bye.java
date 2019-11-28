package com.example.javamavenjunithelloworld;

import java.io.PrintStream;

/**
 * Simple class that says "Hello!".
 */
public class Bye {

    static final String BYE = "Bye!";

    /**
     * Set how many times "Hello!" should be said.
     *
     * @param times How many times should this class say "Hello!"? The value should be no larger than 20.
     * @throws IllegalArgumentException Thrown when times is larger than 20 or a negative number.
     */

    /**
     * Say "Hello!".
     *
     * @param printer PrintStream to write output to.
     */
    public void sayBye(PrintStream printer) {
        printer.println(BYE);
    }

}
