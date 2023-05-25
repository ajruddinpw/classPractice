package multithreading;

class Mythread extends Thread{

    public void run()
    {
        System.out.println("child Thread");
    }
}



public class multi3 {
    public static void main(String[] args) {
        System.out.println("main thread");
Mythread t=new Mythread();
t.start();


    }
    
}
