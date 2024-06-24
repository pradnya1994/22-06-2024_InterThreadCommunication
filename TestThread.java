package InterThreading;

public class TestThread {

	public static void main(String[] args) 
	{
		
		SharedResource resource = new SharedResource();
		
		Producer prod = new Producer(resource);
		Consumer cons = new Consumer(resource);
		
		prod.setName("Producer");
		prod.start();
		
		cons.setName("Consumer");
		cons.start();
		
		
		}

}
