package abstractClass;

abstract class SchoolInfo {
    public void show(){
        System.out.println("School Application");
    }
    abstract  int getAdmissionFee(); //abstract method declared
}
class jibreel extends SchoolInfo{
    int getAdmissionFee(){
        return 25000;
    }
}
class sjms extends SchoolInfo{
    int getAdmissionFee(){
        return 30000;
    }
}
public class School{
    public static void main(String[] args) {
        SchoolInfo s;
        s = new jibreel();
        s.show(); //it will show the header
        System.out.println("the school fee is :" +s.getAdmissionFee());
        s=new sjms();
        System.out.println("the school fee is:" +s.getAdmissionFee());
    }
}
