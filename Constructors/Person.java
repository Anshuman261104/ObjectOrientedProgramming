/*
Question 3:
Create a Person class with a copy constructor that clones another person's attributes.
*/

class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Anshuman", 20);   // Normal object
        Person p2 = new Person(p1);               // Copy constructor

        p1.displayPerson();
        p2.displayPerson();
    }
}

