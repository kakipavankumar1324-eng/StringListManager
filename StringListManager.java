import java.util.ArrayList;

public class StringListManager {
    private ArrayList<String> list = new ArrayList<>();
    public void addElement(String element) {
        list.add(element);
        System.out.println(element + " added successfully.");
    }
    public void removeElement(String element) {
        if (list.remove(element)) {
            System.out.println(element + " removed successfully.");
        } else {
            System.out.println(element + " not found in the list.");
        }
    }
    public void searchElement(String element) {
        if (list.contains(element)) {
            System.out.println(element + " is present in the list.");
        } else {
            System.out.println(element + " is not present in the list.");
        }
    }
    public void displayElements() {
        System.out.println("\nCurrent List:");
        for (String item : list) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {

        StringListManager manager = new StringListManager();
        manager.addElement("Java");
        manager.addElement("Python");
        manager.addElement("C++");
        manager.addElement("JavaScript");
        manager.displayElements();
        manager.searchElement("Python");
        manager.searchElement("HTML");
        manager.removeElement("C++");
        manager.removeElement("Ruby");
        manager.displayElements();
    }
}