interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

interface FaxMachine {
    void faxDocument();
}

class MultiFunctionCopier implements Printer, Scanner, FaxMachine {

    public void printDocument() {
        System.out.println("Printing...");
    }

    public void scanDocument() {
        System.out.println("Scanning...");
    }

    public void faxDocument() {
        System.out.println("Faxing...");
    }
}

class BasicPrinter implements Printer {

    public void printDocument() {
        System.out.println("Printing...");
    }
}

public class task1 {
    public static void main(String[] args) {
        MultiFunctionCopier mfc = new MultiFunctionCopier();
        BasicPrinter bp = new BasicPrinter();

        mfc.printDocument();
        mfc.scanDocument();
        mfc.faxDocument();

        bp.printDocument();
    }
}
