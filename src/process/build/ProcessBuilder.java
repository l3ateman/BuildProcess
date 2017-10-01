package process.build;
import java.lang.*;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class ProcessBuilder {

    public static void main(String[] args)
    {
	    System.out.print("Number of Current process:\t");

	    Runtime runtime = Runtime.getRuntime();

	    System.out.println(runtime.availableProcessors());

        OperatingSystemMXBean mxBean = (com.sun.management.OperatingSystemMXBean)
                ManagementFactory.getOperatingSystemMXBean();


        for (int i = 0; i < 25; i++)
        {
            System.out.println(mxBean.);
            System.out.println(mxBean.getSystemCpuLoad());
        }
    }
}
