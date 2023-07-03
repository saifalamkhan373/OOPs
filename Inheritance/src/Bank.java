public class Bank {
    int getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    @Override
    int getRateOfInterest() {
        return 8;
    }
}
class PNB extends Bank{
    @Override
    int getRateOfInterest() {
        return 9;
    }
}