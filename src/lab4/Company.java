package lab4;

public class Company {

    private HrPerson hr;

    public Company() {
        hr = new HrPerson();
    }

    public void hireEmployee(String firstName, String lastName, String ssn){
        hr.hire(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }
}
