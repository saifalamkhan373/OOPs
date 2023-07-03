//How method overriding works in inheritance
public class Main {
    public static void main(String[] args) {
        SBI s= new SBI();
        PNB p= new PNB();
        System.out.println("SBI interest rate is :" +s.getRateOfInterest());
        System.out.println("PNB interest rate is :" +p.getRateOfInterest());
    }
}