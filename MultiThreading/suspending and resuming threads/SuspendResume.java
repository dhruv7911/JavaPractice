class NewThread implements Runnable{
    Thread t;
    String name;
    boolean flag = false;
    NewThread(String n){
        name = n;
        t = new Thread(this,name);
        t.start();
    }
    public void run(){
        try{
            for(int i = 15;i>0;i--){
                System.out.println(name+": "+i);
                Thread.sleep(200);
                synchronized (this){
                    while(this.flag){
                        wait();
                    }
                }
            }
        }catch(InterruptedException e){
            System.out.println(name+" interrupted");
        }
    }
    synchronized void resume(){
        System.out.println("resuming Thread: "+name);
        flag = false;
        notify();
    }
    synchronized void suspend(){
        System.out.println("suspending Thread: "+name);
        flag = true;
    }
}
class SuspendResume{
    public static void main(String[] args){
        NewThread t1  = new NewThread("t1");
        NewThread t2 = new NewThread("t2");
        try{
            Thread.sleep(1000);
            t1.suspend();
            Thread.sleep(1000);
            t1.resume();
            t2.suspend();
            Thread.sleep(1000);
            t2.resume();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}