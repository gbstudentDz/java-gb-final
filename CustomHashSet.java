import java.util.HashMap;

public class CustomHashSet {
    private static HashMap<Integer, Object> hashMap = new HashMap<>();

    private static final Object OBJ = new Object();

    public static void main(String[] args) {
        add(3);
        add(1);
        add(3);
        add(3);
        add(7);
        add(10);
        add(6);

        System.out.println(hashMap.keySet());

    }

    public static void add(Integer number) {
        hashMap.put(number, OBJ);
    }
}
