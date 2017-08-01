package Solution;

/**
 * This class can be used as a tool to test the running time of an independent method.
 * First, call setStartTime before start running a method.
 * Then, call setEndTime right after completing the method. The run time will be displayed on the console.
 */
public class TimingTool {

	long startTime, endTime;
	TimingTool (){}
	
	public void setStartTime(){
		startTime = System.currentTimeMillis();
	}
	
	public void setEndTime(){
		endTime = System.currentTimeMillis();
		long tm = endTime-startTime;
		if (tm < 0){
			System.out.println("Error!Start time or end time is invalid.");
		}else{
			System.out.println("The running time of the method is " + tm + "ms.");
		}
	}

}
