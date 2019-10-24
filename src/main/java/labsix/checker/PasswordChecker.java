package labsix.checker;

import labsix.data.ResultsTable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A PasswordChecker class that assess the quality of a password.
 *
 * @author Gregory M. Kapfhammer
 */

public class PasswordChecker {

  // TODO: Add any needed instance variables

  /** Create any needed instance variables for the PasswordChecker. */
  public PasswordChecker() {
    // TODO: created any of the needed instance variables
  }

  /**
   * Check the password according to the stated rules.
   * @param password the password for checking
   * @return true if the password is valid, false otherwise
   */
  public boolean check(String password) {
    // TODO: implement the password checking functionality
    // The rules for the password checker are as follows:
    // --> Must contain a digit
    // --> Must contain a lowercase letter
    // --> Must contain an uppercase letter
    // --> Must contain a special symbol of @, #, $, or #
    // --> Must contain at least six characters
    return true;
  }

}
