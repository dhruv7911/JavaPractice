class A{
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        try{
            System.out.println(name+" inside A.foo()");
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("A.foo interrupted");
        }
        System.out.println(name+" trying to call b.last()");
        b.last();
    }
    synchronized void last(){
        System.out.println(Thread.currentThread().getName()+" inside A.last()");
    }
}
class B{
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        try{
            System.out.println(name+" inside b.bar()");
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("B.bar interrupted");
        }
        System.out.println(name+" trying to call a.last()");
        a.last();
    }
    synchronized void last(){

    }
}
class Deadlock implements Runnable{
    A a = new A();
    B b = new B();
    Deadlock(){
        Thread.currentThread().setName("Main Thread");
        Thread t = new Thread(this,"Other Thread");
        t.start();
        a.foo(b);// Main Thread locks a
        System.out.println("Back to "+Thread.currentThread().getName());
    }
    public void run(){
        b.bar(a);//Other Thread locks b
        System.out.println("Back to "+Thread.currentThread().getName());
    }
    public static void main(String[] args){
        new Deadlock();
    }
}