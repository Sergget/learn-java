import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Message> received = List.of(new Message(1, "Hello!"), new Message(2, "发工资了吗？"), new Message(2, "发工资了吗？"),
                new Message(3, "去哪吃饭？"), new Message(3, "去哪吃饭？"), new Message(4, "Bye"));
        List<Message> displayMessages = process(received);
        for (Message message : displayMessages) {
            System.out.println(message.text);
        }
    }

    static List<Message> process(List<Message> received) {
        // TODO: 按sequence去除重复消息
        Set<Message> setMessage = new TreeSet<>();
        setMessage.addAll(received);
        received = new ArrayList<>();
        received.addAll(setMessage);
        return received;
    }
}

class Message implements Comparable<Message> {
    public final int sequence;
    public final String text;

    public Message(int sequence, String text) {
        this.sequence = sequence;
        this.text = text;
    }

    // public boolean equals(Object o) {
    //     if (o instanceof Message) {
    //         Message m = (Message) o;
    //         return this.sequence == m.sequence;
    //     }
    //     return false;
    //     // return Integer.equals(m.sequence, this.sequence);
    // }

    // public int hashCode() {
    //     return Objects.hashCode(this.sequence);
    // }

    public int compareTo(Message m) {
        return Integer.compare(this.sequence, m.sequence);
    }
}