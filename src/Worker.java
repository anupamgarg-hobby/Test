import java.util.HashMap;

public class Worker {
    public Worker() {
        data_ = new HashMap<>();
    }

    public int getCount() {
        return  data_.size();   
    }

    public void increment(String s) {
        if (!data_.containsKey(s)) {
            data_.put(s, new Counter());
        }
        data_.get(s).value++;
    }

    public void decrement(String s) {
        if (!data_.containsKey(s)) {
            data_.put(s, new Counter());
        }
        data_.get(s).value--;
    }

    public int get(String s) {
        return data_.getOrDefault(s, new Counter()).value;
    }

    private HashMap<String, Counter> data_;
}
