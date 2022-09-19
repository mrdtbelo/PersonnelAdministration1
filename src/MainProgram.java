public class MainProgram {
    public static void main(String[] args){

        Employee e1 = new Employee( "Neumann", "Marco", "23.10.1971", 'm', 50, 88.9, " C12", "works mondays to fridays" );
        System.out.println(e1.getName()+"-"+e1.getFirstname()+"-"+e1.getBirthdate()+"-"+e1.getGender()+"-"+e1.getAge()
                +"-"+e1.getWeight()+"-"+e1.getDepartment()+"-"+e1.getSalary()+"-"+e1.getYearsOfService()+"-"+e1.getParticularity());

        Employee e2 = new Employee("Maier", "Stefanie", "09.06.2000", 'f', 22, 62.2, "D24", "nothing" );
        System.out.println(e2.getName()+"-"+e2.getFirstname()+"-"+e2.getBirthdate()+"-"+e2.getGender()+"-"+e2.getAge()
                            +"-"+e2.getWeight()+"-"+e2.getDepartment()+"-"+e2.getSalary()+"-"+e2.getYearsOfService()+"-"+e2.getParticularity());
    }
}