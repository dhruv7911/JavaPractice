class NewThread implements Runnable{
    Thread t;
    String name;
    NewThread(String n){
        name = n;
        t = new Thread(this,name);
        System.out.println("Thread: "+name);
        t.start();
    }
    public void run(){
        try{
            for(int i =0;i<5;i++){
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Thread "+name+" Interrupted");
        }
        System.out.println("Exiting "+name+" Thread");
    }
}
class Index{
    public static void main(String[] args){
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");
         try{
            Thread.sleep(10000);
        }catch(InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
          System.out.println("Exiting Main Thread");

    }
}