import org.example.Account;
import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckNameToEmboss {

    @Test
    public void testValidCardholderName() {

        String name = "Тимоти Шаламе";
        Account account = new Account(name);
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void testInvalidCardholderName_TooShort() {
        String name = "АБ";
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }
    @Test
    public void testInvalidCardholderName_TooLong() {
        String name = "Иван Иванович Иванов Иванович";
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testInvalidCardholderName_NoSpace() {
        String name = "ТимотиШаламе";
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testInvalidCardholderName_SpaceAtBeginning() {
        String name = " Тимоти Шаламе";
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void testInvalidCardholderName_SpaceAtEnd() {
        String name = "Тимоти Шаламе ";
        Account account = new Account(name);
        assertFalse(account.checkNameToEmboss());
    }
}

