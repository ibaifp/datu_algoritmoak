package algoritmoak;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapakEtaSets {
    public static void main(String[] args) {
    	
    	String[] paises = {"España", "Japón", "España", "Noruega", "Italia", "Francia", "Argentina", "Angola"};

        // --- HashMap vs TreeMap ---
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        // --- HashSet vs TreeSet ---
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();

        List<String> arrayList = new ArrayList<>();

        Stack<String> stack = new Stack<>();

        Queue<String> queue = new LinkedList<>();
        
        for(int i = 0; i < paises.length; i++) {
        	hashMap.put(i, paises[i]);
        	treeMap.put(i, paises[i]);
        	
        	hashSet.add(paises[i]);
        	treeSet.add(paises[i]);
        	arrayList.add(paises[i]);
        	
        	stack.push(paises[i]);
        	queue.offer(paises[i]);
        }
        
        System.out.println("Elementuen ordena erakusten:");
        
        System.out.println(hashMap.toString());
        System.out.println(treeMap.toString());
        System.out.println(hashSet.toString());
        System.out.println(treeSet.toString());
        System.out.println(arrayList.toString());
        System.out.println(stack.toString());
        System.out.println(queue.toString());
    }
}