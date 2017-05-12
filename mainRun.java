
public class mainRun 
{
    protected static final BinarySemaphore bs1 = new BinarySemaphore(0);
    protected static final BinarySemaphore bs2 = new BinarySemaphore(1);
    protected static final Semaphore sema4 = new Semaphore(0);
    public static void main(String[] args) throws InterruptedException 
    {
        new Thread(new LetterF()).start().join();

        new Thread(new LetterG()).start();
        
        new Thread(new LetterH()).start();
        
        Thread.sleep(10000);
        System.exit(0);
        System.out.println("Program Terminated");
    }
}