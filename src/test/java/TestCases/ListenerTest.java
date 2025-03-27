package TestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

    public void onTestStart(ITestResult result)
    {
        System.out.println("Test case is started");
    }

    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Test case is success");
    }

    public void onTestFailure(ITestResult result)
    {
        System.out.println("Test case is failed");
    }

    public void onTestSkipped(ITestResult result)
    {
        System.out.println("Test case is skipped");
    }

    public void onFinish(ITestContext context)
    {
        System.out.println("Test execution is finished");
    }

    public void onStart(ITestContext context)
    {
        System.out.println("Test execution is started");
    }

}
