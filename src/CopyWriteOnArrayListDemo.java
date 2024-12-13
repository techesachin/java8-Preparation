import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyWriteOnArrayListDemo {

    public static void main(String[] args) {
        CopyOnWriteArrayList <Integer> CopyOnWriteArrayList  =new CopyOnWriteArrayList<>();
        // Copy write on means that Whenever a write operation
        //like adding or removing an element
        //instead of directly modifying the existing list
        //a new copy of list is created, and modification is applied to that copy
        // This ensures that other thread reading the list while it's being modified are unaffected.

    }
}
