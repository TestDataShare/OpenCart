package testngListners;

import org.testng.ITestListener;

public class Test1 implements ITestListener{

	public static void main(String[] args) {
		
    Test1 t = new Test1();
    t.onFinish(null);
    t.onStart(null);
    t.onTestStart(null);
    t.onTestFailedButWithinSuccessPercentage(null);
    t.onTestFailure(null);
    t.onTestSuccess(null);
    t.onTestSkipped(null);
	}

}
