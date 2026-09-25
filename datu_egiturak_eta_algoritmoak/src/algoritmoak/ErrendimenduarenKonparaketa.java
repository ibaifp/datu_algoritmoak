package algoritmoak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ErrendimenduarenKonparaketa {

    public static void main(String[] args) {
        // Probarako elementu kopurua ezarri
        final int ELEMENTU_KOPURUA = 100000;
        
        System.out.println("ArrayList eta LinkedList-en arteko errendimenduaren konparaketa " + ELEMENTU_KOPURUA + " elementurekin.");
        
        // Zerrendak proba egiteko hasieratu
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        
        // Zerrendak zenbaki aleatorioekin bete, proba-datuak izateko
        Random rand = new Random();
        
        long startTime = System.nanoTime();
        for(int x = 0; x > 10000; x++) {
        	for (int i = 0; i < ELEMENTU_KOPURUA; i++) {
                arrayList.add(rand.nextInt());
            }
        }
        long endTime = System.nanoTime();
        System.out.printf("ArrayList-en denbora: %18d nanosegundo\n", (endTime - startTime));
        
        startTime = System.nanoTime();
        for(int x = 0; x > 10000; x++) {
        	for (int i = 0; i < ELEMENTU_KOPURUA; i++) {
                linkedList.add(rand.nextInt());
            }
        }
        endTime = System.nanoTime();
        System.out.printf("LinkedList-en denbora: %18d nanosegundo\n", (endTime - startTime));
//
//        // --- 'get' eragiketaren konparaketa (indize bidezko sarbidea) ---
//        System.out.println("\n--- Eragiketa: Ausazko elementu batera sartu (get) ---");
//        long startTime = System.nanoTime();
//        int elementuArrayList = arrayList.get(ELEMENTU_KOPURUA / 2); // Erdiko elementura sartu
//        long endTime = System.nanoTime();
//        System.out.printf("ArrayList-en denbora: %d nanosegundo\n", (endTime - startTime));
//
//        startTime = System.nanoTime();
//        int elementuLinkedList = linkedList.get(ELEMENTU_KOPURUA / 2); // Erdiko elementura sartu
//        endTime = System.nanoTime();
//        System.out.printf("LinkedList-en denbora: %d nanosegundo\n", (endTime - startTime));
//        
//        // ArrayList-en sarbidea O(1) da, LinkedList-en O(n) den bitartean
//        System.out.println("Proba honen emaitza: ArrayList nabarmen azkarragoa da.");
//        System.out.println("-------------------------------------------------------");
//
//        // --- 'add' eragiketaren konparaketa (erdian gehitu) ---
//        System.out.println("\n--- Eragiketa: Elementu bat hasierako posizioan gehitu (add(0)) ---");
//        startTime = System.nanoTime();
//        arrayList.add(9999);
//        endTime = System.nanoTime();
//        System.out.printf("ArrayList-en denbora: %d nanosegundo\n", (endTime - startTime));
//
//        startTime = System.nanoTime();
//        linkedList.add(9999);
//        endTime = System.nanoTime();
//        System.out.printf("LinkedList-en denbora: %d nanosegundo\n", (endTime - startTime));
//        
//        // ArrayList-en erdiko txertatzea O(n) da, LinkedList-en O(1) den bitartean
//        System.out.println("Proba honen emaitza: LinkedList nabarmen azkarragoa da.");
//        System.out.println("-------------------------------------------------------");
//        
//        // --- 'remove' eragiketaren konparaketa (erditik ezabatu) ---
//        System.out.println("\n--- Eragiketa: Lehen elementua ezabatu (remove(0)) ---");
//        startTime = System.nanoTime();
//        arrayList.remove(ELEMENTU_KOPURUA - 1);
//        endTime = System.nanoTime();
//        System.out.printf("ArrayList-en denbora: %d nanosegundo\n", (endTime - startTime));
//
//        startTime = System.nanoTime();
//        linkedList.remove(ELEMENTU_KOPURUA - 1);
//        endTime = System.nanoTime();
//        System.out.printf("LinkedList-en denbora: %d nanosegundo\n", (endTime - startTime));
//        
//        // ArrayList-en erdiko ezabatzea O(n) da, LinkedList-en O(1) den bitartean
//        System.out.println("Proba honen emaitza: LinkedList nabarmen azkarragoa da.");
//        System.out.println("-------------------------------------------------------");
//
//        // --- 'add' eragiketaren konparaketa (amaieran gehitu) ---
//        System.out.println("\n--- Eragiketa: Elementu bat amaieran gehitu (add) ---");
//        
//        // Proba honetarako, zerrendak berriro beteko ditugu (segurtasunagatik)
//        arrayList = new ArrayList<>();
//        linkedList = new LinkedList<>();
//        
//        startTime = System.nanoTime();
//        for (int i = 0; i < ELEMENTU_KOPURUA; i++) {
//            arrayList.add(i);
//        }
//        endTime = System.nanoTime();
//        System.out.printf("ArrayList-en denbora: %d nanosegundo\n", (endTime - startTime));
//
//        startTime = System.nanoTime();
//        for (int i = 0; i < ELEMENTU_KOPURUA; i++) {
//            linkedList.add(i);
//        }
//        endTime = System.nanoTime();
//        System.out.printf("LinkedList-en denbora: %d nanosegundo\n", (endTime - startTime));
//
//        // Biak O(1) dira kasurik onenean (amortizatua), baina desberdintasunak egon daitezke
//        System.out.println("Proba honen emaitza: Biak azkarrak dira, baina ArrayList apur bat azkarragoa izan daiteke memoria jarraia delako.");
//        System.out.println("-------------------------------------------------------");
    }
}

