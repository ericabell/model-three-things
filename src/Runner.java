import java.util.Date;

public class Runner {
    Apartment apartment = new Apartment(
            "123 Main",
            "Austin",
            "TX",
            2,
            2);

    Person person = new Person("Eric",
            40,
            new Date());

    Book book = new Book("My awesome book",
            234,
            "Springer",
            "John Grisham");

    public void Runner() {

    }

    public void printInfo() {
        System.out.println(apartment.printInfo());
        System.out.println(person.printInfo());
        System.out.println(book.printInfo());
    }
}
