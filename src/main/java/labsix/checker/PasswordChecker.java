package labsix.checker;

import labsix.data.ResultsTable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A PasswordChecker class that assess the quality of a password.
 *
 * @author Add Your Name Here
 */

public class PasswordChecker {

  /** The pattern for the password. */
  private Pattern pattern;

  /** The pattern for the password. */
  private Matcher matcher;

  /** The regular expression string for the password. */
  private static final String PASSWORD_PATTERN =
      "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,})";

  /** Create any needed instance variables for the PasswordChecker. */
  public PasswordChecker() {
    pattern = Pattern.compile(PASSWORD_PATTERN);
  }

  /**
   * Check the password according to the stated rules.
   * @param password the password for checking
   * @return true if the password is valid, false otherwise
   */
  public boolean check(String password) {
    // use regular expressions to quickly check the password
    matcher = pattern.matcher(password);
    return matcher.matches();
  }

}
