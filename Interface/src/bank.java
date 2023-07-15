public interface bank{
    float rateOfInterest();
    void print();
}
class SBI implements bank {
    public float rateOfInterest() {
        return 9.15f;
    }

    @Override
    public void print() {
        System.out.println("sbi bank");
    }
}

 class PNB implements bank {
    public float rateOfInterest() {
        return 9.7f;
    }
    @Override
    public void print() {
        System.out.println("pnb bank");
    }
}
    class TestInterface2 {
        public static void main(String[] args) {
            bank obj = new SBI();
            System.out.println("ROI of SBI: " + obj.rateOfInterest());
            obj.print();

            bank obj1 = new PNB();
            System.out.println("ROI of PNB: " + obj1.rateOfInterest());
            obj1.print();
        }
    }
