package labsix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import labsix.checker.PasswordChecker;
import org.junit.Test;

/**
 * A JUnit test suite for the PasswordChecker class.
 *
 * @author Gregory M. Kapfhammer
 */

public class TestPasswordChecker {

  @Test
  public void testValidPasswordExampleOne() {
    PasswordChecker checker = new PasswordChecker();
    String validPassword = new String("passworD1A@");
    boolean isValid = checker.check(validPassword);
    assertTrue(isValid);
  }

  @Test
  public void testValidPasswordExampleTwo() {
    PasswordChecker checker = new PasswordChecker();
    String validPassword = new String("passworD1A$");
    boolean isValid = checker.check(validPassword);
    assertTrue(isValid);
  }

  @Test
  public void testInvalidPasswordTooShort() {
    PasswordChecker checker = new PasswordChecker();
    String invalidPassword = new String("s1A$");
    boolean isValid = checker.check(invalidPassword);
    assertTrue(!isValid);
  }

  @Test
  public void testInvalidPasswordNoSymbol() {
    PasswordChecker checker = new PasswordChecker();
    String invalidPassword = new String("pdddas1A");
    boolean isValid = checker.check(invalidPassword);
    assertTrue(!isValid);
  }

  @Test
  public void testInvalidPasswordNoNumber() {
    PasswordChecker checker = new PasswordChecker();
    String invalidPassword = new String("paaaas$A");
    boolean isValid = checker.check(invalidPassword);
    assertTrue(!isValid);
  }

  @Test
  public void testInvalidPasswordNoCapital() {
    PasswordChecker checker = new PasswordChecker();
    String invalidPassword = new String("paaaas$a");
    boolean isValid = checker.check(invalidPassword);
    assertTrue(!isValid);
  }

  @Test
  public void testInvalidPasswordNoLowercase() {
    PasswordChecker checker = new PasswordChecker();
    String invalidPassword = new String("PAAAAS$A");
    boolean isValid = checker.check(invalidPassword);
    assertTrue(!isValid);
  }

  @Test
  public void testMultipleInvalidPasswords() {
    // Reference for these bad passwords:
    // https://www.mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/
    PasswordChecker checker = new PasswordChecker();
    String[] wrongPasswords = {
      "mY1A@", "mkyong12@", "mkyoNg12*",
      "mkyonG$$", "MKYONG12$"
    };
    for (String wrongPassword : wrongPasswords) {
      assertTrue(!checker.check(wrongPassword));
    }
  }

}
