package process.build;
import java.lang.*;
import java.lang.management.ManagementFactory;


public class ProcessBuilder {

    public static void main(String[] args)
    {
	    System.out.print("Number of Current process:\t");

	    Runtime runtime = Runtime.getRuntime();

	    System.out.println(runtime.availableProcessors());

        com.sun.management.OperatingSystemMXBean mxBean = (com.sun.management.OperatingSystemMXBean)
                ManagementFactory.getOperatingSystemMXBean();


        System.out.println(mxBean.getFreePhysicalMemorySize());
        System.out.println(mxBean.getCommittedVirtualMemorySize());
        System.out.println(mxBean.getProcessCpuTime());
        System.out.println(mxBean.getProcessCpuLoad());



    }
}
