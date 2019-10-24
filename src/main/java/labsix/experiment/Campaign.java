package labsix.experiment;

import labsix.checker.PasswordChecker;
import labsix.data.ResultsTable;

/**
 * A Campaign interface used to run an experiment.
 *
 * @author Add Your Name Here
 */

public interface Campaign {

  /** Require that any Campaign implementer can run a PasswordChecker in an experiment. */
  public ResultsTable run(PasswordChecker checker, boolean valid);

}
