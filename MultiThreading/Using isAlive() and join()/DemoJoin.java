class NewThread implements Runnable{
    Thread t;
    String name;
    NewThread(String n){
        name = n;
        t = new Thread(this,name);
        System.out.println("New thread: "+name);
        t.start();
    }
    public void run(){
        try{
            for(int i =0;i<4;i++){
                System.out.println(name+" : "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted Thread: "+name);
        }
        System.out.println("Exiting Thread: "+name);
        
    }
}
class DemoJoin {
    public static void main(String[] args){
        try{
            NewThread t1 = new NewThread("t1");
            t1.t.join();
            System.out.println("Is Thread "+t1.name+" isAlive: "+t1.t.isAlive());
            NewThread t2 = new NewThread("t2");
            t2.t.join();
            System.out.println("Is Thread "+t2.name+" isAlive: "+t2.t.isAlive());
            NewThread t3 = new NewThread("t3");
            t3.t.join();
            System.out.println("Is Thread "+t3.name+" isAlive: "+t3.t.isAlive());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}