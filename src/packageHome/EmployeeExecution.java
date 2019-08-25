package packageHome;

import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;

public class EmployeeExecution {
    public static void main(String[] args) {
        EmployeeInfo employeeInfo = new EmployeeInfo();

        employeeInfo.setAge(27);
        int newAge = employeeInfo.getAge();
        System.out.println(newAge);

        employeeInfo.setNameOfEmployee("Hisham");
        String newName = employeeInfo.getNameOfEmployee();
        System.out.println(newName);

      employeeInfo.setDOB("October, 1st, 1991");
      String newDoB = employeeInfo.getDOB();
        System.out.println(newDoB);

        employeeInfo.setTitle("Nutritionist");
        String newTitle = employeeInfo.getTitle();
        System.out.println(newTitle);

        employeeInfo.setSalary("I wish is was more");
        String newSalary = employeeInfo.getSalary();
        System.out.println(newSalary);
    }
}
