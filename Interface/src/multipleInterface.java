public interface multipleInterface {
    void print();
}
interface Showable{
    void show();
}

class A7 implements multipleInterface,Showable{
    public void print(){System.out.println("Hello");}
    public void show(){
        int sum=0;
        int a= 2;
        int b=3;
        sum=a+b;
        System.out.println(sum);
        System.out.println("Welcome");
    }

    public static void main(String args[]){
        A7 obj = new A7();
        obj.print();
        obj.show();
    }
}