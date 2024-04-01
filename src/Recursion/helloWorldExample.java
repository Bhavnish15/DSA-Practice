package Recursion;

public class helloWorldExample {

   static void message(){
        System.out.println("Hello World from message function");
        message1();
    }
    static void message1(){
        System.out.println("Hello World from function 1");
        message2();
    }
    static void message2(){
        System.out.println("Hello World From function 2");
        message3();
    }
    static void message3(){
        System.out.println("Hello World From function 3");
        message4();
    }
    static void message4(){
        System.out.println("Hello World From function 4");
        message5();
    }
    static void message5(){
        System.out.println("Hello World From function 5");
    }
    public static void main(String[] args){
        message();
    }

}
