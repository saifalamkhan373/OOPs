public class MethodOverloading {
    private static void display(){
        System.out.println("My name is Saif");
    }
    private static void display(String name){
        System.out.println("My name is " +name );
    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.display();
        obj.display("Khan");
    }
}


/* Q)Why method overloading?
Ans) Suppose, you have to perform the addition of given numbers but there can be any number of arguments (let’s say either 2 or 3 arguments for simplicity).

In order to accomplish the task, you can create two methods sum2num(int, int) and sum3num(int, int, int) for two and three parameters respectively.
However, other programmers, as well as you in the future may get confused as the behavior of both methods are the same but they differ by name.

The better way to accomplish this task is by overloading methods. And, depending upon the argument passed, one of the overloaded methods is called.
This helps to increase the readability of the program */
