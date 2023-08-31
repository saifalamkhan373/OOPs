public class Main {
    int num = 5;

    private Main() {
        int a=2, b=3;
        int sum = a+b;
        System.out.println("Constructor is being called");
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Main obj = new Main();
//        System.out.println(obj.num);
    }
}