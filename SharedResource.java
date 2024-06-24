package InterThreading;

public class SharedResource 
{
	private boolean isProduced = false;
	
	public synchronized void produce() throws InterruptedException
	{
		while(isProduced)
		{
			wait();
		}
		for(int i =0 ; i <= 10; i++)
		{
			   System.out.println(Thread.currentThread()+ " "+i);
			
			try 
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			e.getStackTrace();
			}
	
		}
		System.out.println("Produced");
		isProduced = true;
		notify();

	}


	public synchronized void consume() throws InterruptedException
	{
		while(!isProduced)
		{
			wait();
		}

		for(int i =0 ; i <= 10; i++)
		{
			System.out.println(Thread.currentThread()+ " "+i);
			
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
			e.getStackTrace();
			}
		}
		System.out.println("Consume");
		isProduced =false;
		notify();

	}
}
