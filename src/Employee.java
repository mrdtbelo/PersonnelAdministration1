public class Employee {

    private String name;
    private String firstname;
    private String birthdate;
    private char gender;
    private int age;
    private double weight;
    private String department;
    private double salary;
    private int yearsOfService;
    private String particularity;

    public Employee(String n, String f, String b, char g, int a, double w, String p) {
       name = n;
       firstname = f;
       birthdate =  b;
       gender = g;
       age = a;
       weight = w;
       department = "A38";
       salary = 1500;
       yearsOfService = 0;
       particularity = p;
    }

    public String getName(){ return name; }
    public String getFirstname(){ return firstname; }
    public String getBirthdate(){ return birthdate; }
    public char getGender(){ return gender; }
    public int getAge(){ return age; }
    public double getWeight(){ return weight; }
    public String getDepartment(){ return department; }
    public double getSalary(){ return salary;}
    public int getYearsOfService(){ return yearsOfService; }
    public String getParticularity(){ return particularity; }
}
