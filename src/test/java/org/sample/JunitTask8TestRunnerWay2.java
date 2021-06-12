package org.sample;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitTask8TestRunnerWay2 {
	@Test
	public void test2() {
		Result r = JUnitCore.runClasses(JunitTask8.class,JunitTask8A.class,JunitTask8B.class,JunitTask8C.class,JunitTask8D.class);
System.out.println("Total Run Time: "+r.getRunTime());
System.out.println("Total Run Count: "+r.getRunCount());
System.out.println("Failure Count: "+r.getFailureCount());
System.out.println("Ignore Count: "+r.getIgnoreCount());
List<Failure> f = r.getFailures();
for (Failure fails : f) {
	System.out.println(fails);
	
}
}

}
