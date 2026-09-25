package ISP;

public class MultiFunction implements Printer,Scanner,Fax{

    @Override
    public void faxDocument() {
        System.out.println("Faxing document...");
    }

    @Override
    public void printDocument() {
        System.out.println("Printing document....");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning document....");
    }
}
