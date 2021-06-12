public interface SList{

    /**
     *  Add val to end of list. Any String is OK.
     * @param val String
     * @return boolean
     */
    boolean add(String val);

    /**
     *  Gets index. Index is from 0 to n-1.
     * @param  index int
     */
    String get(int index);

    /**
     * Checks if list is empty
     * @return boolean
     */
    boolean isEmpty();

    /**
     * Removes index. Index is from 0 to n-1.
     * @param index int
     */
    String remove(int index);

    /**
     * To get size of list.
     * @return int
     */
    int size();

    /**
     * Returns list of odd numbered words only.
     * @return SListInterface
     */
    SList oddWords();


    /**
     * Returns list of even numbered words only.
     * @return LinkedListInterface
     */
    SList evenWords(); // Returns list of even numbered words only

    }

