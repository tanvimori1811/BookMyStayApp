import java.util.LinkedList;
import java.util.Queue;

public class BookingRequestQueue {

    private Queue<Reservation> queue;

    public BookingRequestQueue() {
        queue = new LinkedList<>();
    }

    // add request
    public void addRequest(Reservation reservation) {
        queue.add(reservation);
    }

    // get request
    public Reservation getRequest() {
        return queue.poll(); // removes and returns
    }

    // check empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}