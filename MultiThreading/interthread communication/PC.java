class Q{
    int n;
    boolean setValue = false;
    synchronized void put(int n){
        while(setValue){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Interrupted Exception");
            }
        }
        this.n = n;
        System.out.println("put:"+n);
        setValue=true;
        notify();
    }
    synchronized int get(){
        while(!setValue){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println("Interrupted Exception");
            }
        }
        System.out.println("got:"+n);
        setValue=false;
        notify();
        return n;
    }
}
class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q = q;
        new Thread(this,"consumer").start();
    }
    public void run(){
        while(true){
            q.get();
        }
    }
}
class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q = q;
        new Thread(this,"producer").start();
    }
    public void run(){
        int i = 0;
        while(true){
            q.put(i++);
        }
    }
}
class PC{
    public static void main(String[] args){ 
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}