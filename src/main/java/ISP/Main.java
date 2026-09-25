package ISP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Simple Printer Printing task...");
        Printer simple=new SimplePrinter();
        simple.printDocument();

        System.out.println();
        System.out.println("MultiFunction Printer Printing,Scanning & Faxing Document...");
        MultiFunction multiFunction=new MultiFunction();

        multiFunction.printDocument();
        multiFunction.scanDocument();
        multiFunction.faxDocument();
    }
}
