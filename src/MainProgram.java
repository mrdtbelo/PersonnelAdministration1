public class MainProgram {
    public static void main(String[] args) {

        Employee e1 = new Employee("Neumann", "Marco", "23.10.1957", 'm', 65, 88.9, " C12", 3600.58, "works mondays to fridays");
        System.out.println(e1.getName() + "-" + e1.getFirstname() + "-" + e1.getBirthdate() + "-" + e1.getGender() + "-" + e1.getAge()
                + "-" + e1.getWeight() + "-" + e1.getDepartment() + "-" + e1.getSalary() + "-" + e1.getYearsOfService() + "-" + e1.getParticularity());

        Employee e2 = new Employee("Müller", "Stefanie", "09.06.1977", 'f', 45, 62.2, "D24", 8600.36, "nothing");
        System.out.println(e2.getName() + "-" + e2.getFirstname() + "-" + e2.getBirthdate() + "-" + e2.getGender() + "-" + e2.getAge()
                + "-" + e2.getWeight() + "-" + e2.getDepartment() + "-" + e2.getSalary() + "-" + e2.getYearsOfService() + "-" + e2.getParticularity());

        Employee e3 = new Employee("Schröder", "Anna", "19.03.2002", 'f', 20, 58.7, "A30", 2100.21, "nothing");
        System.out.println(e3.getName() + "-" + e3.getFirstname() + "-" + e3.getBirthdate() + "-" + e3.getGender() + "-" + e3.getAge()
                + "-" + e3.getWeight() + "-" + e3.getDepartment() + "-" + e3.getSalary() + "-" + e3.getYearsOfService() + "-" + e3.getParticularity());

        Employee e4 = new Employee("Eckert", "Julianne", "28.02.1989", 'f', 33, 77.5, "G22", 10000.93, "has 2 kids");
        System.out.println(e4.getName() + "-" + e4.getFirstname() + "-" + e4.getBirthdate() + "-" + e4.getGender() + "-" + e4.getAge()
                + "-" + e4.getWeight() + "-" + e4.getDepartment() + "-" + e4.getSalary() + "-" + e4.getYearsOfService() + "-" + e4.getParticularity());

        Employee e5 = new Employee("Meyer", "Thomas", "01.01.1968", 'm', 54, 95.6, "A43", 15000.34, "broke his leg");
        System.out.println(e5.getName() + "-" + e5.getFirstname() + "-" + e5.getBirthdate() + "-" + e5.getGender() + "-" + e5.getAge()
                + "-" + e5.getWeight() + "-" + e5.getDepartment() + "-" + e5.getSalary() + "-" + e5.getYearsOfService() + "-" + e5.getParticularity());

        Employee e6 = new Employee("Roth", "Sebastian", "18.03.1979", 'm', 43, 93.85, "C27", 5356.24, "nothing");
        System.out.println(e6.getName() + "-" + e6.getFirstname() + "-" + e6.getBirthdate() + "-" + e6.getGender() + "-" + e6.getAge()
                + "-" + e6.getWeight() + "-" + e6.getDepartment() + "-" + e6.getSalary() + "-" + e6.getYearsOfService() + "-" + e6.getParticularity());

        if (Employee.getAge() > 39) {
            System.out.println( e6.getSalary() = 3000.0);
        }
        if (Employee.getAge() > 49) {
            System.out.println( Employee.getSalary() = math.random(4000-5000));
        }
    }
}