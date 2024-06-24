package InterThreading;
/*Here we have created Consumer thread using extends Thread class. Thread start executing from the run 
 *method . We have created the reference of SharedResource class. and generated Constructor of the class
 *Then by using reference of SharedResource class we have called the consumer() method of the 
 *SharedResource class
 * 
 */
public class Consumer extends Thread{

	private final SharedResource resource;

	public Consumer(SharedResource resource) {
		super();this.resource = resource;
	}

	public void run()
{
	try
	{
		resource.consume();
		Thread.sleep(700);
	}
	catch(InterruptedException e)
	{
		Thread.currentThread().interrupt();
	}
}
}

