package algoritmoak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List; // Interfazea inportatu

public class ZerrendakEtaBektoreakAdibideak {

    public static void main(String[] args) {
        System.out.println("--- ArrayList (Bektore dinamikoa) Adibideak ---");
        // ArrayList bat sortu: tamaina dinamikoa duen array bat bezalakoa da
        // Elementuak gehitzea eta atzitzea azkarra da
        ArrayList<String> ikasleZerrenda = new ArrayList<>();

        // Elementuak gehitu
        ikasleZerrenda.add("Ane"); // 0. posizioa
        ikasleZerrenda.add("Jon"); // 1. posizioa
        ikasleZerrenda.add("Mikel"); // 2. posizioa
        ikasleZerrenda.add("Leire"); // 3. posizioa
        System.out.println("Hasierako ikasle zerrenda: " + ikasleZerrenda);

        // Elementu bat atzitu posizioaren arabera
        String bigarrenIkaslea = ikasleZerrenda.get(1);
        System.out.println("Bigarren ikaslea: " + bigarrenIkaslea);

        // Elementu bat aldatu posizioaren arabera
        ikasleZerrenda.set(1, "Jone");
        System.out.println("Ikasle zerrenda aldatu ondoren: " + ikasleZerrenda);

        // Elementu bat ezabatu posizioaren arabera
        ikasleZerrenda.remove(0); // "Ane" ezabatzen du
        System.out.println("Ikasle zerrenda 'Ane' ezabatu ondoren: " + ikasleZerrenda);

        // Elementu bat ezabatu balioaren arabera
        ikasleZerrenda.remove("Leire"); // "Leire" ezabatzen du
        System.out.println("Ikasle zerrenda 'Leire' ezabatu ondoren: " + ikasleZerrenda);

        // Zerrendaren tamaina lortu
        System.out.println("Ikasle zerrendaren tamaina: " + ikasleZerrenda.size());

        // Zerrenda iteratu
        System.out.print("Ikasle zerrenda iteratuz: ");
        for (String ikaslea : ikasleZerrenda) {
            System.out.print(ikaslea + " ");
        }
        System.out.println("\n");


        System.out.println("--- LinkedList (Zerrenda lotua) Adibideak ---");
        // LinkedList bat sortu: nodo bidezko egitura da
        // Elementuak gehitu eta ezabatzea eraginkorra da erdian ere
        LinkedList<Integer> zenbakiZerrenda = new LinkedList<>();

        // Elementuak gehitu
        zenbakiZerrenda.add(10); // Lehenengo elementua
        zenbakiZerrenda.add(20);
        zenbakiZerrenda.add(30);
        zenbakiZerrenda.add(1, 15); // 1. posizioan gehitu
        System.out.println("Hasierako zenbaki zerrenda: " + zenbakiZerrenda);

        // Lehenengo eta azken elementuak gehitu
        zenbakiZerrenda.addFirst(5);
        zenbakiZerrenda.addLast(35);
        System.out.println("Zenbaki zerrenda addFirst/addLast ondoren: " + zenbakiZerrenda);

        // Elementu bat atzitu (ArrayList bezain azkarra ez da posizioz)
        Integer hirugarrenZenbakia = zenbakiZerrenda.get(2);
        System.out.println("Hirugarren zenbakia: " + hirugarrenZenbakia);

        // Lehenengo eta azken elementuak atera (eta ezabatu)
        Integer lehenengoa = zenbakiZerrenda.pollFirst(); // edo zenbakiZerrenda.removeFirst();
        Integer azkena = zenbakiZerrenda.pollLast(); // edo zenbakiZerrenda.removeLast();
        System.out.println("Ateratako lehenengoa: " + lehenengoa + ", Ateratako azkena: " + azkena);
        System.out.println("Zenbaki zerrenda pollFirst/pollLast ondoren: " + zenbakiZerrenda);

        // Elementu bat ezabatu balioaren arabera
        zenbakiZerrenda.remove(Integer.valueOf(20)); // int balioa Integer objektu bihurtu
        System.out.println("Zenbaki zerrenda '20' ezabatu ondoren: " + zenbakiZerrenda);

        // Zerrenda iteratu
        System.out.print("Zenbaki zerrenda iteratuz: ");
        for (Integer zenbakia : zenbakiZerrenda) {
            System.out.print(zenbakia + " ");
        }
        System.out.println("\n");

        System.out.println("--- List interfazea erabiltzea ---");
        // Polimorfismoa erakusteko, List interfazea erabil daiteke
        // Inplementazio espezifikoa (ArrayList edo LinkedList) alda daiteke erraz
        List<String> frutaZerrenda = new ArrayList<>(); // ArrayList erabiliz
        frutaZerrenda.add("Sagarra");
        frutaZerrenda.add("Madaria");
        System.out.println("Fruta zerrenda (ArrayList): " + frutaZerrenda);

        frutaZerrenda = new LinkedList<>(); // Orain LinkedList erabiliz
        frutaZerrenda.add("Marrubia");
        frutaZerrenda.add("Banana");
        System.out.println("Fruta zerrenda (LinkedList): " + frutaZerrenda);
    }
}

