import java.util.ArrayDeque;
import java.util.Queue;

public class Supermarket {

    private Queue<String> queue1 = new ArrayDeque<>(5);
    private Queue<String> queue2 = new ArrayDeque<>(5);


    public void add() {
        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue1.offer("Mike" + Integer.toString(i));
        }
        System.out.println(queue1);
        System.out.println();
    }


}
