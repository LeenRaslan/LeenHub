package week9.exc3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
    Caesar caesar=new Caesar();
    @Test
    void testEncryptOneWord() {
        String plaintext = "HELLO";
        String ciphertext = caesar.cipher(plaintext, 1);
        Assertions.assertEquals("IFMMP", ciphertext);

    }
    @Test
    void testEncryptSeveralWords() {
        String plaintext = "hello, world";
        String ciphertext = caesar.cipher(plaintext, 13);
        Assertions.assertEquals("uryyb, jbeyq", ciphertext);
    }

    @Test
    void testEncryptUpperAndLowerCase() {
        String plaintext = "be sure to drink your Ovaltine";
        String ciphertext = caesar.cipher(plaintext, 13);
        Assertions.assertEquals("or fher gb qevax lbhe Binygvar", ciphertext);
    }
}