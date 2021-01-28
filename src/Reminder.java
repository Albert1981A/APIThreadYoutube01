public class Reminder {
    private int num;
    private boolean valueSet = false;

    public synchronized void put(int num){
        while(valueSet){
            try { wait();} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
        this.num = num;
        System.out.println("V Put value " + num);
        valueSet = true;
        notify();
    }

    public synchronized void get(){
        while(!valueSet){
            try { wait();} catch (InterruptedException e) { System.out.println(e.getMessage());}
        }
        System.out.println(num);
        System.out.println("> Get value " + num);
        valueSet = false;
        notify();
    }


}
