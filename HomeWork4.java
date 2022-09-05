import java.util.List;
public class HomeWork4 {
    public static void main(String[] args) {
        List<String> names = List.of("Zakoshisyoh", "Kotouge", "Nishimura", "Masanori", "Takashi", "rinse");
        names.stream().map(name -> name.getBytes()).forEach(name -> System.out.println(name));
        names.stream().map(String::toLowerCase).forEach(System.out::println);
    }
}
