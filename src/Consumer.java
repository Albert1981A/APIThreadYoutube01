import static java.lang.Thread.sleep;

public class Consumer implements Runnable{

    private Reminder reminder;

    public Consumer(Reminder reminder) {
        this.reminder = reminder;
        Thread t1 = new Thread(this, "Consumer");
        t1.start();
    }

    @Override
    public void run() {
        while (true) {
            reminder.get();
            try {
                sleep(500);} catch (InterruptedException e) {System.out.println(e.getMessage());}
        }
    }


}
