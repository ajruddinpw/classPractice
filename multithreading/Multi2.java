package multithreading;

public class Multi2 {
    public static void main(String[] args) {
        System.out.println("main thread");
        System.out.println("before  changing");
        String name=Thread.currentThread().getName();
        System.out.println("the name of main thread is "+name);
    System.out.println( "the priority of main thread is "+   Thread.currentThread().getPriority());
    System.out.println("after changing");
    Thread t=Thread.currentThread();
    t.setName("pw");
    t.setPriority(1);

    String name1=Thread.currentThread().getName();
        System.out.println("the name of main thread is "+name1);
    System.out.println( "the priority of main thread is "+   Thread.currentThread().getPriority());


    }
    
}
