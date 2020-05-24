package U9_T3;

public class Customer {
    private int num;
    private String name;
    private String lastName;
    private String contactName;
    private String phone;
    private String addres1;
    private String addres2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private int employeeNUmber;
    private double creditLimit;

    public Customer(int num, String name, String lastName, String contactName, String phone,
                    String addres1, String addres2, String city, String state, String postalCode,
                    String country, int employeeNUmber, double creditLimit) {
        this.num = num;
        this.name = name;
        this.lastName = lastName;
        this.contactName = contactName;
        this.phone = phone;
        this.addres1 = addres1;
        this.addres2 = addres2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.employeeNUmber = employeeNUmber;
        this.creditLimit = creditLimit;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddres1() {
        return addres1;
    }

    public void setAddres1(String addres1) {
        this.addres1 = addres1;
    }

    public String getAddres2() {
        return addres2;
    }

    public void setAddres2(String addres2) {
        this.addres2 = addres2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEmployeeNUmber() {
        return employeeNUmber;
    }

    public void setEmployeeNUmber(int employeeNUmber) {
        this.employeeNUmber = employeeNUmber;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", phone='" + phone + '\'' +
                ", addres1='" + addres1 + '\'' +
                ", addres2='" + addres2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", employeeNUmber=" + employeeNUmber +
                ", creditLimit=" + creditLimit +
                '}';
    }
}
