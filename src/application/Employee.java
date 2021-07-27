package application;

public class Employee {
    private int id;
    private String fname;
    private String lname;
    private float salary;
    private int age;
    private String department;
    private String address;
    private String date_of_birth;
    private String gender;
    private String education;
    private String experience;
    private String contract_start;
    private String contract_end;
    private String nationality;
    private String mother_language;
    private String other_language;

    public Employee() {
        super();
    }

    public Employee(int id, String fname, String lname, float salary, int age, String department, String address, String date_of_birth) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.age = age;
        this.department = department;
        this.address = address;
        this.date_of_birth = date_of_birth;
    }

    public Employee(int id, String fname, String lname, float salary, int age, String department, String address, String date_of_birth,
                    String gender, String education, String experience, String contract_start, String contract_end, String nationality,
                    String mother_language, String other_language) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.age = age;
        this.department = department;
        this.address = address;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.education = education;
        this.experience = experience;
        this.contract_start = contract_start;
        this.contract_end = contract_end;
        this.nationality = nationality;
        this.mother_language = mother_language;
        this.other_language = other_language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getContract_start() {
        return contract_start;
    }

    public void setContract_start(String contract_start) {
        this.contract_start = contract_start;
    }

    public String getContract_end() {
        return contract_end;
    }

    public void setContract_end(String contract_end) {
        this.contract_end = contract_end;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMother_language() {
        return mother_language;
    }

    public void setMother_language(String mother_language) {
        this.mother_language = mother_language;
    }

    public String getOther_language() {
        return other_language;
    }

    public void setOther_language(String other_language) {
        this.other_language = other_language;
    }
}
