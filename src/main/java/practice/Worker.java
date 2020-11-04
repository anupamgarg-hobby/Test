package practice;

import java.util.HashMap;

public class Worker {
    public Worker() {
        data = new HashMap<>();
    }

    public int getCount() {
        return  data.size();   
    }

    public void increment(String s) {
        if (!data.containsKey(s)) {
            data.put(s, new Counter());
        }
        data.get(s).value++;
    }

    public void decrement(String s) {
        if (!data.containsKey(s)) {
            data.put(s, new Counter());
        }
        data.get(s).value--;
    }

    public int get(String s) {
        return data.getOrDefault(s, new Counter()).value;
    }

    private HashMap<String, Counter> data;
}
