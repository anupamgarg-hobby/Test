public class Main {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.increment("Hi");
        System.out.println(w.get("Hi"));
    }
}
