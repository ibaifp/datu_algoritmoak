package algoritmoak;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PilaIlarak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ariketa3();
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

}
