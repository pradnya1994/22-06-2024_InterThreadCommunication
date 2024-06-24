package InterThreading;
/*Here we have created Producer thread using extends Thread class. Thread start executing from the run 
 *method . We have created the reference of SharedResource class. and generated Constructor of the class
 *Then by using reference of SharedResource class we have called the produce() method of the 
 *SharedResource class
 * 
 */
public class Producer  extends Thread
{

	private final SharedResource resource;

	public Producer(SharedResource resource) 
	{
		this.resource = resource;
	}

	public void run() 
	{
		try
		{
			resource.produce();
			Thread.sleep(700);
		}
		catch(InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}
}
}
