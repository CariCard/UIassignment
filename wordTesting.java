package jUnit;
import java.util.concurrent.Future;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class wordTesting {

	  public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(wordOccurances.class);
			
	      for (Future failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
	}  


