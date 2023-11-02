package hsw.gradle.template;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IBANTest {
    @Test void IBANDE() {
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), true);
    }

    @Test void IBANnotDE() {
        String myIBAN = "DA68210501700012345678";
        IBAN classUnterTest = new IBAN(myIBAN);
        assertEquals(classUnterTest.check(myIBAN), false);
    }

    @Test void IBANWrong() {
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.check(myIBAN), false);
    }

    @Test void IBAN_seltsam_printAsCard() {
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.printAsCard(myIBAN), "Vorname Nachname\nIBAN: " + myIBAN);
    }

    @Test void IBAN_seltsam_print() {
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertEquals(classUnderTest.print(myIBAN), "IBAN: " + myIBAN);
    }
}
