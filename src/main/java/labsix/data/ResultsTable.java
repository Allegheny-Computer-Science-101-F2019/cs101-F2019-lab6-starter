package labsix.data;

import java.util.Arrays;

/**
 * A results table that stores data from running a timing experiment.
 *
 * @author Add Your Name Here
 */

public class ResultsTable {

  /** The two-dimensional array (table) of the results. */
  private long[][] results;

  /** The current row in the table. */
  private int currentRow;

  /** The first row in the table. */
  private static final int FIRST_ROW = 0;

  /** The number of columns in the table. */
  private static final int COLUMN_NUMBER = 3;

  /** The size index into the table. */
  private static final int SIZE = 0;

  /** The timing index into the table. */
  private static final int TIMING = 1;

  /** The ratio index into the table. */
  private static final int RATIO = 2;

  /** Create a new instance of the ResultsTable. */
  public ResultsTable(int rowCount) {
    results = new long[rowCount][COLUMN_NUMBER];
    currentRow = 0;
  }

  /** Return the entire two-dimensional array of the results. */
  public long[][] getResultsTable() {
    return results;
  }

  /** Store another row of results in the table. */
  public void addResult(long size, long timing) {
    // TODO: Add your implementation of the addResult method
  }

  /** Return the number of rows current in the table. */
  public int getRowCount() {
    return currentRow;
  }

  /** Return a string of the array-based table. */
  public String toString() {
    String resultsTextual = Arrays.deepToString(results)
        .replace("], ", "\n")
        .replace(", ", "\t\t")
        .replace("[", "")
        .replace("[[", "")
        .replace("]]", "");
    return "Size (#)\tTiming (ms)\tRatio (#)\n" + resultsTextual;
  }

}
