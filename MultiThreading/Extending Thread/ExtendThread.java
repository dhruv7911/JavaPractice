class NewThread extends Thread{
    NewThread(){
        super("My Thread");
        System.out.println("Child Thread: "+this);
        start();
    }
    public void run(){
        try{
            for(int i =0;i<5;i++){
                System.out.println("Child Thread: "+i);
                Thread.sleep(1000);//1sec
            }
        }catch(InterruptedException e){
            System.out.println("Child Thread Interrupted");
        }
        System.out.println("Exit Child Thread");
    }

}
public class ExtendThread{
    public static void main(String[] args){
        new NewThread();
         try{
            for(int i =0;i<5;i++){
                System.out.println("Main Thread: "+i);
                Thread.sleep(1000);//1sec
            }
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Exit Main Thread");
    }
}