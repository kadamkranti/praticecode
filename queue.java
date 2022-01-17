package praticescode;


public class queue 
{
public static void main(String[] args) 
{
        		queue<String> locationsqueue = new queue();
locationsqueue.add("Kolkata");
        		locationsqueue.add("Patna");
        		locationsqueue.add("Delhi");
        		locationsqueue.add("Gurgaon");
        		locationsqueue.add("Noida");
System.out.println("Queue is : " + locationsqueue);
        		System.out.println("Head of Queue : " + locationsqueue.peek());
        		locationsqueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsqueue);
        		System.out.println("Size of Queue : " + locationsqueue.size());
    	}
}

