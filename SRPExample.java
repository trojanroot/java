class Report{
    void generateReport(){
        System.out.println("Generate Report...");
    }
}
class ReportPrinter{
    void printReport(){
        System.out.println("Printing Report...");
    }
}
public class SRPExample {
    public static void main(String[] args) {
        Report report=new Report();
        ReportPrinter printer =new ReportPrinter();
        report.generateReport();
        printer.printReport();
    }
}
