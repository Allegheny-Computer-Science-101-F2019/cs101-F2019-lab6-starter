package labsix.experiment;

import labsix.checker.PasswordChecker;
import labsix.data.ResultsTable;

import java.util.Random;

/**
 * A RunCampaign class that can run an experiment with a PasswordChecker.
 *
 * @author Add Your Name Here
 */

public class RunCampaign implements Campaign {

  /** The starting size for running an experiment campaign. */
  private static final int INPUT_SIZE_START = 250;

  /** The growth factor for input when running an experiment campaign. */
  private static final int INPUT_GROWTH_FACTOR = 2;

  /** The total number of input size doubles to perform for an experiment campaign. */
  private static final int CAMPAIGN_LENGTH = 10;

  /** The indentation level for the output. */
  private static final String IDENTATION = "  ";

  /** Randomly generate valid passwords to use in an experiment. */
  public String generateValidRandomPassword(int size) {
    // TODO: Add a complete implementation of a method to generate valid
    // passwords of a specified size (see the password spec for details)
    return new String("");
  }

  /** Randomly generate invalid passwords to use in an experiment. */
  public String generateInvalidRandomPassword(int size) {
    // TODO: Add a complete implementation of a method to generate invalid
    // passwords of a specified size (see the password spec for details)
    return new String("");
  }

  /** Run a Sorter in an experiment campaign. */
  public ResultsTable run(PasswordChecker checker, boolean valid) {
    int campaignRound = 0;
    int currentInputSize = INPUT_SIZE_START;
    ResultsTable results = new ResultsTable(CAMPAIGN_LENGTH);

    if ( valid ) {
      System.out.println("Starting a campaign of experiments with valid passwords" + " ...");
      // TODO: Run a campaign of experiments with random passwords known to be valid
    } else {
      // TODO: Run a campaign of experiments with random passwords known to be invalid
    }
    System.out.println("... Finishing a campaign of experiments with the password checker ...");
    return results;
  }

}
