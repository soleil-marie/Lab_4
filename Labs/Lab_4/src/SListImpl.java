public class SListImpl implements SList {
    Node head;

    /**
     * Constructor.
     */
    public SListImpl(){
        head = null;
    }

    /**
     * Add val to end of list. Any String is OK.
     *
     * @param val String
     * @return boolean
     */
    @Override
    public boolean add(String val) {
        if(head == null){
            head = new Node(val);
            return true;
        } // go through list (copy) until you find the next null object, then assign null object to new node
        Node item = head; // copy linkedlist
        while(item.next != null){
            item = item.next;
        } // while loop goes until reaches null pointer
        item.next = new Node(val);
        return true;
    }

    /**
     * Gets index. Index is from 0 to n-1.
     *
     * @param index int
     */
    @Override
    public String get(int index) {
        Node item = head;
        int count2 = 0;
        while (count2 != index) {
            item = item.next;
            count2++;
        }
        return item.data;
    }


    /**
     * Checks if list is empty
     *
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        Node item = head;
        return item == null;
    }

    /**
     * Removes index. Index is from 0 to n-1.
     *
     * @param index int
     */
    @Override
    public String remove(int index) {
        int count = 0;
        Node item3 = head;
        while (count != index) {
            item3 = item3.next;
            count++;
        }
        item3.data = null;
        return null;
    }


    /**
     * To get size of list.
     *
     * @return int
     */
    @Override
    public int size() {
        int count = 0;
        Node item2 = head;
        while(item2 != null){
            item2 = item2.next;
            count++;
        }
        return count;
    }

    /**
     * Returns list of odd numbered words only.
     *
     * @return LL
     */
    @Override
    public SList oddWords() {
        SList retList = new SListImpl();
        Node thing = head; // copy of head
        int count = 0;
        while(thing != null){
            if(count % 2 == 1){
                retList.add(thing.data); // access data string
            }
            thing = thing.next;
            count++;
        }
        System.out.println(retList.toString());
        return retList;

    }

    /**
     * Returns list of even numbered words only.
     *
     * @return LL
     */
    @Override
    public SList evenWords() {
        SList retList = new SListImpl();
        Node thing = head; // copy of head
        int count = 0;
        while (thing != null) {
            if (count % 2 == 0) {
                retList.add(thing.data); // access data string
            }
            thing = thing.next;
            count++;
        }
        System.out.println(retList.toString());
        return retList;
    }



    @Override
    public String toString() {
        return "SListImpl{" +
                "head=" + head +
                '}';
    }

    public static void main(String[] args) {
        SList item1 = new SListImpl();
        item1.add("hello");
        item1.add("world");
        item1.remove(1);
        System.out.println(item1.size());
        SList item2 = new SListImpl();
        item2.add("this");
        item2.add("flower");
        item2.add("the");
        item2.add("rose");
        System.out.println(item2.oddWords());
        System.out.println(item2.evenWords());
        System.out.println(item2.size());
        System.out.println(item2.get(3));
        SList item3 = new SListImpl();
        System.out.println(item3.isEmpty());
        item2.remove(0);
        System.out.println(item2.size());

    }
}


