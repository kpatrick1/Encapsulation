package lab4;

import java.util.ArrayList;
import java.util.List;

public class HrPerson {
    private List<Employee> empList;

    public HrPerson() {
        empList = new ArrayList();
    }

    public void hire(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName, lastName, ssn);
        empList.add(e);
        orientEmployee(e);
    }

    public void orientEmployee(Employee e) {
        e.doFirstTimeOrientation("L117");
    }

    public void outputReport(String ssn){
        Employee e = null;

        for (Employee emp: empList){
            if (emp.getSsn().equals(ssn)){
                e = emp;
                break;
            } else {
                return;
            }
        }
        if (e.isMetWithHr() && e.isMetDeptStaff() && e.isReviewedDeptPolicies() && e.isMovedIn()){
            e.getReportService().outputReport();
        }
    }

    public List<Employee> getEmployees() {
        return empList;
    }


    public static void main(String[] args) {
        HrPerson hr = new HrPerson();
        hr.hire("John", "Doe", "333-33-3333");
        System.out.println(hr.getEmployees());
    }

}
