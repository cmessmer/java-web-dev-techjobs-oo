package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.assertFalse;

import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;

public class JobTest {
   @Before
   public void createJobObjects() {
     Job job1 = new Job();
     Job job2 = new Job();

   }
   @Test
   public void testSettingJobId() {
      Job job1 = new Job();
      Job job2 = new Job();
      assertFalse(job1.equals(job2));
      assertTrue((job2.getId()-1) == job1.getId());
   }

   @Test
   public void testJobConstructorSetsAllFields() {
      Job newJobToTest = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

      assertTrue(newJobToTest instanceof Job);

      assertTrue(newJobToTest.getName() == "Product tester");

      assertTrue(newJobToTest.getEmployer() instanceof Employer);
      assertTrue(newJobToTest.getEmployer().getValue() == "ACME");

      assertTrue(newJobToTest.getLocation() instanceof Location);
      assertTrue(newJobToTest.getLocation().getValue()=="Desert");

      assertTrue(newJobToTest.getPositionType() instanceof PositionType);
      assertTrue(newJobToTest.getPositionType().getValue()== "Quality Control");

      assertTrue(newJobToTest.getCoreCompetency() instanceof CoreCompetency);
      assertTrue(newJobToTest.getCoreCompetency().getValue() == "Persistence");

   }

   @Test
   public void testJobsForEquality() {
      Job job1 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      Job job2 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

      assertFalse(job1.equals(job2));
   }

   @Test
   public void testToString() {
      Job job1 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      int afterJobInfo = (job1.toString().length()-1);

      assertTrue(job1.toString().charAt(0) == '\n');
      assertTrue(job1.toString().charAt(afterJobInfo) == '\n');
   }
   @Test

   public void toStringPrint() {
      Job job1 = new Job("Product tester", new Employer("ACME"),new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

      String[] lines = job1.toString().trim().split("\n");

      System.out.println(job1.toString());
      assertTrue(lines.length == 1);




   }
}


