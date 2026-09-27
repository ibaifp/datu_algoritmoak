package algoritmoak;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PilaIlarak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ariketa5();
	}
	
	private static void ariketa1() {
		/*
		 * 1- Pila behekaldeko balioak ilararatu: pila batetan dauzkazun elementuak, 
		 * azpitik hasita eta hurrenkera errespetatuz, ilara batetara pasatu.
		 */
		
		Deque<String> pila = new ArrayDeque<>();
		pila.push("Hola");
		pila.push("Paco");
		pila.push("Palíndromo");
		pila.push("Montaña");
		
		System.out.println(pila.toString());
		
		Deque<String> pilaAux = new ArrayDeque<>();
		while(!pila.isEmpty()) {
			pilaAux.push(pila.pop());
		}
		System.out.println(pilaAux.toString());
		
		Queue<String> ilara = new LinkedList<>();
		while(!pilaAux.isEmpty()) {
			ilara.offer(pilaAux.pop());
		}
		
		System.out.println(ilara.toString());
	}

	private static void ariketa2() {
		/*
		 * 2- Ilara bat irauli: ilara batetako balioak erabiliz, atzetik 
		 * aurrerako elementuen iraulketa bat egin.
		 */
		
		Queue<Integer> ilara = new LinkedList<>();
		ilara.offer(2);
		ilara.offer(54);
		ilara.offer(33);
		ilara.offer(10);
		ilara.offer(99);
		
		System.out.println(ilara);
		
		Deque<Integer> pila = new ArrayDeque<Integer>();
		while(!ilara.isEmpty()) {
			pila.push(ilara.poll());
		}
		System.out.println(pila.toString());
	}

	private static void ariketa3() {
		/*
		 * 3- Palindromoa egiaztatu pila eta ilara erabiliz: hitz bat irakurri eta egiaztatu palindromoa 
		 * den ala ez. Horretarako, hitzaren karaktereak pila batean eta ilara 
		 * batean gorde, eta gero bi egituren elementuak konparatu. 
		 * Elementu guztiak berdinak badira, hitza palindromoa da.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Idatzi hitz bat palindromoa baden ikusteko: ");
		String hitza = sc.nextLine();
		
		Queue<String> ilara = new LinkedList<>();
		Deque<String> pila = new ArrayDeque<>();
		
		for(String l : hitza.split("")) {
			ilara.offer(l);
			pila.push(l);
		};
		
		Boolean berdinak = true;
		
		for(int i = 0; i < ilara.size(); i++) {
			if(!pila.pop().equals(ilara.poll())) {
				berdinak = false;
				break;
			}
		}
		
		if(berdinak) {
			System.out.println(hitza + " hitza palindromoa da!");
		}else {
			System.out.println(hitza + " hitza ez da palindromoa!");
		}
		sc.close();
	}
	
	private static void ariketa4() {
		/*
		 * 4- Ilara bateko lehenengo N elementuak irauli: zenbaki osoz osatutako 
		 * ilara bat eta N balio bat emanda, ilarako lehenengo N elementuak bakarrik irauli. Gainerako elementuek 
		 * hasierako hurrenkera mantendu behar dute. Horretarako, pila bat erabili egitura laguntzaile gisa.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> ilara = new LinkedList<Integer>();
		Queue<Integer> ilaraAux = new LinkedList<Integer>();
		ilaraAux.offer(2);ilaraAux.offer(99);ilaraAux.offer(23);ilaraAux.offer(45);ilaraAux.offer(13);ilaraAux.offer(87);ilaraAux.offer(59);
		
		System.out.println("Ilarako zenbakiak: " + ilaraAux.toString());
		
		System.out.print("Zenbat zenbaki nahi duzu buelta emon? ");
		int n = Integer.parseInt(sc.nextLine());
		
		Deque<Integer> pilaAux = new ArrayDeque<Integer>();
		
		for(int i = 0; i < n; i++) {
			pilaAux.push(ilaraAux.poll());
		}
		
		System.out.println("Pilako zenbakiak: " + pilaAux.toString());
		
		while(!pilaAux.isEmpty()) {
			ilara.offer(pilaAux.pop());
		}
		
		ilara.addAll(ilaraAux);
		System.out.println("Ilara emaitza: " + ilara.toString());
		sc.close();
	}
	
	private static void ariketa5() {
		/*
		 * 5- Pila eta ilara ordenatuta mantendu: teklatutik zenbaki osoak irakurri 0 sartu arte. 
		 * Sartutako zenbaki bakoitza aldi berean ilara batean eta pila batean gorde. Ilarako elementuak 
		 * txikienetik handienera ordenatuta mantendu, eta pilako elementuak handienetik txikienera, 
		 * goiko aldetik beheko aldera. 0 balioa amaitzeko bakarrik erabiliko da eta ez da egituretan gordeko. 
		 * Pila eta ilarak bakarrik erabil daitezke; ezin dira ArrayList, 
		 * Collections.sort(), Arrays.sort() edo antzeko egiturak eta ordenazio-metodoak erabili.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		Queue<Integer> ilara = new LinkedList<Integer>();
		Deque<Integer> pila = new ArrayDeque<Integer>();
		
		boolean bukatuta = false;
		
		do {
			System.out.print("Sartu zenbaki bat: ");
			int num = sc.nextInt();
			
			if(num == 0) {
				bukatuta = true;
			}else {
				ilara = txikitikHandienera(ilara, num);
			}
			
		}while(!bukatuta);
		
		pila = ilaratikPilara(ilara, pila);
		
		System.out.println("Ilarako zenbakiak txikitik handienera: " + ilara.toString());
		System.out.println("pilako zenbakiak handienetik txikietara : " + pila.toString());
		sc.close();
		
	}
	
	private static Queue<Integer> txikitikHandienera(Queue<Integer> ilara, int num) {
		
		Queue<Integer> ilaraAux = new LinkedList<Integer>();
		boolean ordenatuta = false;
		
		if(!ilara.isEmpty()) {
			for(int i : ilara) {
				if(num <= i && !ordenatuta) {
					ilaraAux.offer(num);
					ordenatuta = true;
				}
				ilaraAux.offer(i);
			}
			
			if(!ordenatuta) ilaraAux.offer(num);
		}else {
			ilaraAux.offer(num);
		}
		return ilaraAux;
	}

	private static Deque<Integer> ilaratikPilara(Queue<Integer> ilara, Deque<Integer> pila) {
			
			for(int i : ilara) {
				pila.push(i);
			}
			
			return pila;
		}
}
