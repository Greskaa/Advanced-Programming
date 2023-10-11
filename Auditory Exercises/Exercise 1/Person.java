public class Person {
    String firstname;
    String lastName;
    int age;

    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return
                "Firstname = " + firstname + "\n" +
                "LastName = " + lastName + "\n" +
                "Age = " + age + "\n";
    }

    public static void main(String[] args)
    {
        Person person1 = new Person("Stefan", "Andonov",30);
        Person person2 = new Person("Gresa", "Kadriu", 22);

        System.out.println(person1);
        System.out.println(person2);

        //System.out.println(person2=person1);

        System.out.println(person1.equals(person2));
    }
}
