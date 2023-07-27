package oving6.delegation.office;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Printer {
    private HashMap<Employee, List<String>> doc_history = new HashMap<>();

    void printDocument(String document, Employee employee) {
        System.out.println(document);
        if (doc_history.containsKey(employee)) {
            doc_history.get(employee).add(document);
        } else {

            List<String> documents = new ArrayList<>();

            documents.add(document);

            doc_history.put(employee, documents);
        }
    }

    public List<String> getPrintHistory(Employee employee) {

        if (doc_history.keySet().contains(employee) && doc_history.get(employee).size() != 0) {

            return new ArrayList<>(doc_history.get(employee));
        }

        else {
            return new ArrayList<>();
        }

    }
}
