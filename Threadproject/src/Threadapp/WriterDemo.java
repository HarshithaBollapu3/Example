package Threadapp;
class Writer
{ 
    String msg;
    public Writer(String msg)
    {
        this.msg=msg;
    }
}

 

class WriterRunner implements Runnable
{
    Writer writer;
    public WriterRunner(Writer writer)
    {
        this.writer=writer;
    }

    public void run()
    {
        synchronized(writer)
        {
            System.out.println("cab acquired with message "+writer.msg);
             try{
                 //cab.wait(3000);
                 writer.wait();
             }
             catch(InterruptedException e)
             {
                 System.out.println(e);
             }

        }
    }

}

 

class CabNotifier implements Runnable
{
    Writer writer;
    public CabNotifier(Writer writer)
    {
        this.writer=writer;
    }
    public void run()
    {
        synchronized(writer)
        {
            try{
                //cab.notifyAll();
             writer.notify();
                System.out.println("cab notified ..");
            }

            catch(Exception e)
            {
                System.out.println(e);
            }
    }
    }
}

public class WriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Writer writer=new Writer("Cab to station");
		   WriterRunner runner=new WriterRunner(writer);
		   WriterRunner runner1=new WriterRunner(writer);
		   WriterNotifier notifier=new WriterNotifier(writer);
		   Thread t1=new Thread(runner);
		   Thread t3=new Thread(runner1);
		   Thread t2=new Thread(notifier);
		   t1.start();
		   t3.start();
		    try{
		        Thread.sleep(3000);
		    }
		    catch(Exception e)
		    {
		        System.out.println(e);
		    }
		   t2.start();
		    }

		 



	}

}
