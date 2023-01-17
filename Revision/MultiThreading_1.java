// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.lang.Thread;
import java.lang.Runnable;

class Test extends Thread{

    public void run(){
        System.out.println("Inside Test Run Method");
        
        for(int i=0;i<10;i++){
            System.out.println("R@1:"+i);
        }
    }
    
}

class Test2 implements Runnable{
    
    public void run(){
        System.out.println("Inside Test2 Run Method");
        
        for(int i=100;i<110;i++){
            System.out.println("R@2:"+i);
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Test t1 = new Test();
        
        Test2 t2 = new Test2();
        Thread t = new Thread(t2);
        
        t1.start();
        t.start();
        
        
        for(int i=20;i<25;i++){
            System.out.println("M@1:"+i);
        }
    }
}
