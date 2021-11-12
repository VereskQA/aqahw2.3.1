import com.github.javafaker.Faker;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String locale = "ru";
        Faker faker = new Faker(new Locale(locale));
        String city = faker.address().city();
        System.out.println(city);
    }
}