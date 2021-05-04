public class Main {
    public static void main(String args[]) {

    }
}

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
        if (supplies <= 0) {
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
    int med;

    public void meds() {
        if (med <= 0) {
            System.out.println("I cannot give you any meds.");
        } else {
            med--;
            System.out.println("Take those pills!");
        }
    }
    public void addmed (int med){ this.med += med; }
}
class Therapist extends Employee {
    int altmed;

    public void stressball() {
        if (altmed <=0){
            System.out.println("I ran out of stress balls!");
        } else {
            altmed--;
            System.out.println("Take this stress ball.");
        }
    }
    public void addaltmed (int altmed){ this.altmed += altmed; }
}

class Receptionist extends Employee {
    int paper;
    public void papers() {
        if (paper <= 0) {
            System.out.println("I need more paper soon.");
        } else {
            paper--;
            System.out.println("Time to get some work done!");
        }
    }
    public void addpaper (int paper){ this.paper += paper; }
}
class Surgeon extends Employee {
    int scalpel;
    public void tools() {
        if (scalpel <= 0) {
            System.out.println("I need more scalpels soon.");
        } else {
            scalpel--;
            System.out.println("Time to start slicing and dicing");
        }
    }
    public void addscalpel (int scalpel){ this.scalpel += scalpel;}
}
class Administrator extends Employee {


}

class Nurse extends Employee {

}