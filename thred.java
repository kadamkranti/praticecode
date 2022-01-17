package praticescode;


public class thred extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		thred mt = new thred();
  		mt.start();
 	}
}
