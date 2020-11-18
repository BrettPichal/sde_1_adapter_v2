package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        ReedAdapter adapter = new ReedAdapter();

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // set good answers
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("true");
        answers.add("yes");
        answers.add("oh yeah");
        answers.add("great");
        answers.add("sure");
        answers.add("love to");
        answers.add("of course");
        answers.add("always");
        answers.add("never done otherwise");
        adapter.addAnswers(answers);

        // read response
        Boolean ans1 = reader.readLine().equals("Yep");

        //TODO
        // the reader should accept the following values as true:
        // "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"


        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}
