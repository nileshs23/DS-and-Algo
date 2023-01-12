// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        
        try{
            Child c = new Child();
            c.fun2();
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("Rest of Code !");
    }
}

class Parent{
    
    Parent() throws Exception{
        System.out.println("Inside parent constructor");
    }
    
    public void fun1(){
        System.out.println("inside fun1 of Parent class");
    }
}

class Child extends Parent{
    
    Child() throws Exception{
        System.out.println("Child Class Constructor.");
    }
    
    public void fun2(){
        try{
            Parent p = new Parent();
            p.fun1();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
