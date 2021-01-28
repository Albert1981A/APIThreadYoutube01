public class Producer implements Runnable{

    private Reminder reminder;

    public Producer(Reminder reminder) {
        this.reminder = reminder;
        Thread t2 = new Thread(this, "Producer");
        t2.start();
    }

    @Override
    public void run() {
        int i=0;
        while(true) {
            reminder.put(i++);
            try {Thread.sleep(3000);} catch (InterruptedException e) {System.out.println(e.getMessage());}
        }
    }

}
