package oving6.delegation.office;

import java.util.Collection;
import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Manager implements Employee {

    Collection<Employee> employees;
    private int counter;

    Manager(Collection<Employee> employees) {
        if (employees.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.employees = employees;
        }

    }

    private Employee findEmployee() {

        return employees.stream()
                .min(Comparator.comparingInt(Employee::getTaskCount))
                .orElse(null);
    }

    @Override
    public double doCalculations(BinaryOperator<Double> operation, double value1, double value2) {
        counter++;
        return findEmployee().doCalculations(operation, value1, value2);
    }

    @Override
    public void printDocument(String document) {
        counter++;
        findEmployee().printDocument(document);
    }

    @Override
    public int getTaskCount() {
        return counter;

    }

    @Override
    public int getResourceCount() {

        return 1 + employees.stream()
                .mapToInt(Employee::getResourceCount).sum();

    }

}
