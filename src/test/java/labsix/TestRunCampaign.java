package labsix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import labsix.checker.PasswordChecker;
import labsix.experiment.RunCampaign;
import org.junit.Test;

/**
 * A JUnit test suite for the RunCampaign class.
 *
 * @author Gregory M. Kapfhammer
 */

public class TestRunCampaign {

  @Test
  public void testCampaignDataGeneratorWorksSmallValid() {
    RunCampaign campaign = new RunCampaign();
    String generatedData = campaign.generateValidRandomPassword(250);
    assertEquals(generatedData.length(), 250);
    assertTrue((new PasswordChecker()).check(generatedData));
  }

  @Test
  public void testCampaignDataGeneratorWorksSmallInvalid() {
    RunCampaign campaign = new RunCampaign();
    String generatedData = campaign.generateInvalidRandomPassword(250);
    assertEquals(generatedData.length(), 250);
    assertTrue(!(new PasswordChecker()).check(generatedData));
  }

  @Test
  public void testCampaignDataGeneratorWorksMediumValid() {
    RunCampaign campaign = new RunCampaign();
    String generatedData = campaign.generateValidRandomPassword(500);
    assertEquals(generatedData.length(), 500);
    assertTrue((new PasswordChecker()).check(generatedData));
  }

  @Test
  public void testCampaignDataGeneratorWorksMediumInvalid() {
    RunCampaign campaign = new RunCampaign();
    String generatedData = campaign.generateInvalidRandomPassword(500);
    assertEquals(generatedData.length(), 500);
    assertTrue(!(new PasswordChecker()).check(generatedData));
  }

  @Test
  public void testCampaignDataGeneratorWorksLargeValid() {
    RunCampaign campaign = new RunCampaign();
    String generatedData = campaign.generateValidRandomPassword(1000);
    assertEquals(generatedData.length(), 1000);
    assertTrue((new PasswordChecker()).check(generatedData));
  }

  @Test
  public void testCampaignDataGeneratorWorksLargeInvalid() {
    RunCampaign campaign = new RunCampaign();
    String generatedData = campaign.generateInvalidRandomPassword(1000);
    assertEquals(generatedData.length(), 1000);
    assertTrue(!(new PasswordChecker()).check(generatedData));
  }

}
