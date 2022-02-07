import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(ListNode.getFromArrayString("[1,2,3,4,5,6,7]").toString());
    }
}

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode getFromArrayString(String list) {
        String[] split = list.replace("[", "").replace("]", "").split(",");
        if (split.length == 0) {
            return null;
        }
        ListNode head = new ListNode(Integer.parseInt(split[0]));
        ListNode tail = head;
        for (int i = 1; i < split.length; i++) {
            tail.next = new ListNode(Integer.parseInt(split[i]));
            tail = tail.next;
        }
        return head;
    }

    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(val);
        while (next != null) {
            list.add(next.val);
            next = next.next;
        }
        return list.toString();
    }

}