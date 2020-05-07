public class Main {
    public static void main(String[] args) {
        Pair<Number> p1= new Pair<>(12.3,4.56);
        Pair<Integer> p2 = new Pair<>(123,456);
        setsame(p1, 100);
        setsame(p2, 200);

        System.out.println(p1.getFirst()+","+p1.getLast());
        System.out.println(p2.getFirst()+","+p2.getLast());
    }

    static void setsame(Pair<? super Integer> p, Integer n){
        p.setFirst(n);
        p.setLast(n);
    }
}

class Pair<T> {
    private T first;
    private T last;
    public Pair(T first, T last){
        this.first=first;
        this.last=last;
    }

    /**
     * @return the first
     */
    public T getFirst() {
        return first;
    }

    /**
     * @return the last
     */
    public T getLast() {
        return last;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(T first) {
        this.first = first;
    }

    /**
     * @param last the last to set
     */
    public void setLast(T last) {
        this.last = last;
    }
}