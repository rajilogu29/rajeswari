package testlist;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class lis implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("fail");
			}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skip");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finish");
	}
	
}

	