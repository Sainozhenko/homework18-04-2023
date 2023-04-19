package homeworkTommorow;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Berliner", 4);
        Person person = new Person("John", 18, address);


        Address address1 = new Address("Beelive", 18);
        Person person1 = new Person("Jack", 15, address1);

        Address address2 = new Address("BroklynAvenue", 67);
        Person person2 = new Person("Margaret", 32, address2);

        List<Person> input = List.of(person, person1, person2);

        System.out.println(getAddresses(input));

        System.out.println(repeatWordWhenStartWith("aaa ffff aa bbbb a bb aaa gggggggggggggg", "a"));
    }

    public static int repeatWordWhenStartWith(String input, String letter) {
        return Arrays.stream(input.split(" "))
                .filter(str -> str.charAt(0) == letter.charAt(0))
                .count();
    }

    public static List<Address> getAddresses(List<Person> input) {
        return input.stream().filter(p -> p.getAge() > 17)
                .map(a -> a.getAddress())
                .collect(Collectors.toList());
    }
}
