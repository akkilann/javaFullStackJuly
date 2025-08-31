import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Akilan");
        list.add("Kabilan");
        list.add("mukilan");
        list.set(1,"kappa");
        list.stream().forEach(System.out::println);
    }
}
