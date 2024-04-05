import java.util.ArrayList;
import java.util.List;

public class Test {
    private List<Integer> points;

    public Test() {
        points = new ArrayList<>();
    }
    public void addNumber (int point) {
        points.add(point);
    }
    public void testProcess() {
        if (points.isEmpty()) {
        } else {
            points.clear();
        }
    }

    }
