public class Employee {

private String id , fullName;
    private int salary  ;


    /////////////constauct
    public Employee() {
    }

    public Employee(String id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    //////////////////////seter
    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
  //////  ///////////////geter


    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }


    public int getAnnualSalary(){

        return   getSalary() * 12;
    }

    public double raisedSalray(double percent){

         percent =(double) getSalary() * percent;

        return salary += (double) percent;
    }



    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}
