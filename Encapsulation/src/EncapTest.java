/* File name : RunEncap.java */
public class EncapTest {

    public static void main(String args[]) {
        RunEncap encap = new RunEncap();
        encap.setName("Saif's");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
    }
}