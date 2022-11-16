package utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CryptoHelper {

    SecretKey sKey;
    private Cipher encCipher;
    private Cipher decCipher;

    public CryptoHelper(String key) throws Exception {
        byte[] keyBytes = stringToByteArray(key);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        this.sKey = keyFactory.generateSecret(new DESKeySpec(keyBytes));
        initCiphers();
    }

    public static byte[] stringToByteArray(String inp) {
        byte[] byteArray = new byte[inp.length()];
        for (int i = 0; i < inp.length(); i++) {
            byteArray[i] = (byte) inp.charAt(i);    // Move each element of string to array indices
        }
        return byteArray;
    }

    public static String byteArrayToString(byte[] inputArray) {
        String res = "";
        for (byte b : inputArray) {
            res += byteToString(b);
        }
        return res;
    }

    public static String byteToString(byte aByte) {
        return String.valueOf((char) (aByte & 0xFF));
    }

    public void initCiphers() throws Exception {
        this.encCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        this.decCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

        this.encCipher.init(Cipher.ENCRYPT_MODE, sKey);
        this.decCipher.init(Cipher.DECRYPT_MODE, sKey);

    }

    public String encrypt(String rawString) {

        String encodedString = new String(Base64.getEncoder().encode(rawString.getBytes(StandardCharsets.UTF_16BE)));
        byte[] encodedByteArray = CryptoHelper.stringToByteArray(encodedString);
        byte[] encryptedEncodedByteArray = new byte[0];
        try {
            encryptedEncodedByteArray = this.encCipher.doFinal(encodedByteArray);
        } catch (Exception e) {
            System.out.println(e);
        }
        String encryptedEncodedString = CryptoHelper.byteArrayToString(encryptedEncodedByteArray);
        return new String(Base64.getEncoder().encode(encryptedEncodedString.getBytes(StandardCharsets.UTF_16BE))); // encodedEncryptedEncodedString
    }

    public String decrypt(String encodedEncryptedEncodedString) {

        byte[] encryptedEncodedByteArray = Base64.getDecoder().decode(encodedEncryptedEncodedString);
        String encryptedEncodedString = new String(encryptedEncodedByteArray, StandardCharsets.UTF_16BE);
        encryptedEncodedByteArray = CryptoHelper.stringToByteArray(encryptedEncodedString);
        byte[] encodedByteArray = new byte[0];
        try {
            encodedByteArray = this.decCipher.doFinal(encryptedEncodedByteArray);
        } catch (Exception e) {
            System.out.println(e);
        }
        byte[] rawByteArray;
        String encodedString = CryptoHelper.byteArrayToString(encodedByteArray);
        rawByteArray = Base64.getDecoder().decode(encodedString);
        return new String(rawByteArray, StandardCharsets.UTF_16BE); // rawString
    }

}
