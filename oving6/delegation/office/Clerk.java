package oving6.delegation.office;

import java.util.function.BinaryOperator;

public class Clerk implements Employee {
    private Printer printer;
    private int counter;

    public Clerk(Printer printer) {
        this.printer = printer;

    }

    @Override
    public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
        counter++;
        return operation.apply(value1, value2);

    }

    @Override
    public void printDocument(String document) {
        printer.printDocument(document, this);
        counter++;

    }

    @Override
    public int getTaskCount() {
        return counter;

    }

    @Override
    public int getResourceCount() {
        return 1;
    }

public static void main(String[] args) {

        Printer printer = new Printer();
        Clerk clerk = new Clerk(printer);
        System.out.println(printer.getPrintHistory(clerk));
    }

}
