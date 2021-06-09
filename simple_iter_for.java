import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class App {
    public static void main(String[] args) {
        LinkedList<String> gradovi = new LinkedList<String>();
        gradovi.add("Pula");
        gradovi.add("Rijeka");
        gradovi.add("Zagreb");
        gradovi.add("Split");
        gradovi.add("Osijek");
        gradovi.add("Dubrovnik");
        
        printList(gradovi);

        gradovi.add(1, "Varadžin");
        printList(gradovi);

        gradovi.remove(4);
        printList(gradovi);

        printListwithfor(gradovi);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Sada smo u: " + i.next());
        }
        System.out.println("=========================");
    }

    private static void printListwithfor(LinkedList<String> linkedList) {
        System.out.println("Ispis iz liste pomoću enhanced for petlje:");
        for (String item : linkedList) {
            System.out.println(item);
        }
        System.out.println("=========================");
    }

    

























}
