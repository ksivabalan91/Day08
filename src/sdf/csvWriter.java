package sdf;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csvWriter {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPERATOR = "\n";
    private static final String FILE_HEADER = "staffNo,fullName,department,email,salary\n";
    public List<Employee> employees;

    public List<Employee> generateEmployees() {

        employees = new ArrayList<>();
        // create some employees
        Employee emp1 = new Employee("12345", "Barbaros", "MSE",
                "barbosa@email.com", 80_000);
        Employee emp2 = new Employee("45251", "Blackbeard", "EEE",
                "bb@email.com", 60_000);
        Employee emp3 = new Employee("84651", "Daniel", "MSE",
                "danielkidd@email.com", 20_000);
        Employee emp4 = new Employee("84569", "Adewale", "ECE",
                "adeade@email.com", 100_000);

        // Add employee to list
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        return employees;       

    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException{
        FileWriter fw = new FileWriter(fileName,true);

        fw.append(FILE_HEADER);
        // fw.append(NEWLINE_SEPERATOR);

        // read records row by row and write records

        for(Employee e: employees){
            fw.append(e.toString());
            // fw.append(e.getDepartment());
            // fw.append(COMMA_DELIMITER);
            // fw.append(e.getFullName());
            // fw.append(COMMA_DELIMITER);
            // fw.append(e.getDepartment());
            // fw.append(COMMA_DELIMITER);
            // fw.append(e.getEmail());
            // fw.append(COMMA_DELIMITER);
            // fw.append(e.getSalary().toString());
            // fw.append(COMMA_DELIMITER);
            // fw.append(NEWLINE_SEPERATOR);
        }
        fw.flush();
        fw.close();


    }

}
