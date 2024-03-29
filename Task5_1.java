import java.util.HashMap;
import java.util.List;

public class task5_1 
{
    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        findInPhoneBook("Глинко");
    }

    public static void addInPhoneBook() {
        phoneBook.put("Глинко", List.of("+7(111)111-11-11", "+7(222)222-22-22"));
        phoneBook.put("Бартош", List.of("+7(333)333-33-33", "+7(444)444-44-44"));
        phoneBook.put("Пилипович",List.of("+7(555)555-55-55", "+7(666)666-66-66"));

    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
