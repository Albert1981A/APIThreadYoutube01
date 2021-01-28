public class InterThread {
    public static void main(String[] args) {

        Reminder reminder = new Reminder();

        Producer p1 = new Producer(reminder);
        Consumer c1 = new Consumer(reminder);
    }
}
