public class Main {
    int num = 5;

    Main() {
        System.out.println("Constructor is being called");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.num);
    }
}