import java.util.List;

public class DataTypes {

    public static long sum(List<Integer> numbers) {

        int s = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int i = 0, n = numbers.size(); i < n; i++) {
            s += numbers.get(i);
        }
        return s;
    }
}
