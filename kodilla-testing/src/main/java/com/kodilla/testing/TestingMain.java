package com.kodilla.testing;

import com.kodilla.testing.user.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main() {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        //kolejny test
        System.out.println("Test: pierwszy test jednostkowy addAtoB:");

        Calculator calc1 = new Calculator();
        int result1 = calc1.addAToB(5, 5);

        if (result1 == 10) {
            System.out.println("Test addAtoB is OK");
        } else {
            System.out.println("Error");
        }
        //kolejny test
        System.out.println("Test: drugi test jednostkowy subtractAFromB");

        Calculator calc2 = new Calculator();
        int result2 = calc2.subtractAFromB(10, 5);

        if (result2 == 5) {
            System.out.println("Test subtractAFromB is OK");
        } else {
            System.out.println("Error");
        }
    }
}