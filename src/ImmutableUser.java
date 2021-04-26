import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class ImmutableUser {
    private final String name;
    private final List<Integer> item;
    private final LocalDate age;

    public ImmutableUser(String name, List<Integer> item, LocalDate age) {
        this.name = name;
        this.item = new ArrayList<Integer>(item);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public List getItem() {
        return new ArrayList(item);
    }

    public LocalDate getAge() {
        return age;
    }

    public static void main(String[] args) {
        List<Integer> test = new ArrayList();
        test.add(1);
        test.add(2);
        LocalDate age = LocalDate.of(12, 12, 12);
        ImmutableUser immutableUser = new ImmutableUser("poxos", test, age);


    }
}

