class Employee {

    int id;
    String name;

    Employee(int id,String name) {
        this.id=id;
        this.name=name;
    }

    void display() {
        System.out.println(id+" "+name);
    }
}


public class Exercise4EmployeeManagement {


    public static void main(String[] args) {


        Employee employees[] = new Employee[3];


        employees[0]=new Employee(101,"John");
        employees[1]=new Employee(102,"David");
        employees[2]=new Employee(103,"Sam");


        for(Employee e:employees) {
            e.display();
        }


        int search=102;


        for(Employee e:employees) {

            if(e.id==search)
                System.out.println("Employee Found : "+e.name);
        }

    }
}