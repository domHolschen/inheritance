public class Main {
    public static void main(String args[]) {

    }
}
// testing commitssssss
class Employee {
    String name, degree;
    float salary, yearsOfExperience;

    public void createEmployee(String name, String degree, float salary, float yearsOfExperience) {
        this.name = name;
        this.degree = degree;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }
}

class Janitor extends Employee {
    int supplies;

    public void clean() {
        if (supplies == 0) {
            System.out.println("Cannot clean, no supplies");
        } else {
            supplies--;
            System.out.println("Successfully cleaned");
        }
    }

    public void addSupplies(int supplies) {
        this.supplies += supplies;
    }
}

class Doctor extends Employee {

}

class Therapist extends Employee {

}

class Receptionist extends Employee {

}

class Surgeon extends Employee {

}

class Administrator extends Employee {

}

class Nurse extends Employee {

}