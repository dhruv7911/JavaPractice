class CallMe{
    synchronized public void call(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
    Thread t;
    CallMe target;
    String msg;
    Caller(CallMe targ,String m){
        t = new Thread(this);
        target = targ;
        msg =m;
        t.start();
    }
    public void run(){
        target.call(msg);
    }
}
public class Synch{
    public static void main(String[] args){
        CallMe target = new CallMe();
        Caller ob1 = new Caller(target,"Hello");
        Caller ob2 = new Caller(target,"Synchronized");
        Caller ob3 = new Caller(target,"World");
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}