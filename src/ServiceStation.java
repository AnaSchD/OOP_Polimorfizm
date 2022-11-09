import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {

    private Queue<T> queueOfTransport = new LinkedList<>();

    public void addTransportToQueue(T transport) {
        if (transport instanceof Bus) {
            System.out.println("Автобус не может встать в очередь");
        } else {
            queueOfTransport.offer(transport);
        }
    }

    public void technicalInspection(T transport) {
        if (transport != null) {
            System.out.println("Транспорт " + transport.getBrand() + transport.getModel() + " прошел технический осмотр");
            transport = queueOfTransport.poll();
        }
    }


    @Override
    public String toString() {
        return "ServiceStation{" +
                "queueOfTransport=" + queueOfTransport +
                '}';
    }
}


