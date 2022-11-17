package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Hashing algorithm.
public class HashHelper {

    public static String getMd5(String input) {
        try {

            // Static method for getting instance of MD5 algorithm.
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Digestion operation that returns byte array.
            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into SIGNUM.
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value.
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
