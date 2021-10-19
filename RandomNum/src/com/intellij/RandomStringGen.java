package com.intellij;

import java.util.Random;

public class RandomStringGen {

    public static String generateName(PhotoManager photoManager) {
        String randomString;
        do {
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            // create random string builder
            StringBuilder sb = new StringBuilder();

            // create an object of Random class
            Random random = new Random();

            for(int i = 0; i < 6; i++) {
                // generate random index number
                int index = random.nextInt(alphabet.length());

                // get character specified by index
                // from the string
                char randomChar = alphabet.charAt(index);

                // append the character to string builder
                sb.append(randomChar);
            }
            randomString = sb.toString();

        } while (photoManager.nameExists(randomString));

        return randomString;
    }
}
