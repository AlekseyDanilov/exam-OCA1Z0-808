package com.company.chapter4.pack;

/**
 * Created by Данилов on 21.07.2017.
 */
public class YetMoreInitializationOrder {
    static { add(2); }
    static void add(int num) { System.out.print(num + " "); }
    YetMoreInitializationOrder() { add(5); }
    static { add(4); }
    { add(6); }
    static { new YetMoreInitializationOrder(); }
    { add(8); }
    public static void example() { }
}
//          The correct answer is 2 4 6 8 5. Let's walk through why that is. There are three static blocks:
//        on lines 7, 10, and 12. They run in that order. The static block on line 7 calls the add() method,
//        which prints 2. The static block on line 10 calls the add() method, which prints 4.
//        The last static block,  on line 12, calls new to instantiate the object.
//        This means we can go on to rule 3 to look at the instance variables and instance initializers.
//        There are two of those: on lines 11 and 13. They both call the add() method and print 6 and 8, respectively.
//        Finally, we go on to rule 4 and call the constructor, which calls the add() method one more time and prints 5.

