package DataStructuresAndAlgorithms;

public class Array {
    private int[] items;
    private int count;


    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item){
        // If array is full, resize it
        if (items.length == count){
            // Create new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all existing items
             for (int i = 0; i  < count; i += 1){
                 newItems[i] = items[i];
             }

             // Set "items" to this new array
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        // Validate index
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();


        // Shift the items to the left to fill the hole
        for (int i = index; i < count; i += 1)
            items[i] = items[i + 1];

            count--;
    }

    // runtime complexity is O(n)
    public int indexOf(int item){
        for (int i = 0; i < count; i += 1)
            if (items[i] == item)
                return i;

            return -1;
    }

    public void print(){
        for (int i = 0; i < count; i += 1){
            System.out.println(items[i]);
        }
    }
}
