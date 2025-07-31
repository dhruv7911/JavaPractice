class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread(this,"My Thread");
        System.out.println("Child Thread: "+t);
        t.start();
    }
    public void run(){
        try{
            for(int i =0;i<5;i++){
                System.out.println("Child Thread: "+i);
                Thread.sleep(1000);//1 second
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Exit child Thread");
    }
    
}
public class ImplementRunnable{
    public static void main(String[] args){
        new NewThread();
        try{
            for(int i =0;i<5;i++){
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);//1 second
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Exit Main Thread");
    }
}