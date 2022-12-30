public class User implements Comparable<User>{

    private Personal subordinates = new Personal();
    private String firstName;
    private  String lastName;
    private int age;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public User(Personal subordinates, String firstName, String lastName, int age) {
        this(firstName, lastName, age);
        this.subordinates = subordinates;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User other) {
        String fullName = this.firstName + " " + this.lastName;
        String fullNameO = other.firstName + " " + other.lastName;
        if (fullName.equals(fullNameO)){
            return this.age - other.age;
        }
        return fullName.compareTo(fullNameO);
    }

    public Personal getSubordinates() {
        return subordinates;
    }
}
