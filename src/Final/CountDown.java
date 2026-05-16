package Final;

public class CountDown extends Thread{
    private int n;

    public CountDown(int n)
    {
        this.n = n;
    }

    @Override
    public void run() {
        for(int i = n; i >= 1; i--)
        {
            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Finished");
    }

}
