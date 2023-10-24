import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;


public class SystemManager {

    public static void main (String args[]){
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        Set<Character> alphabet = new HashSet<>();
        for (char c : chars) { alphabet.add(c); }

        String[] positions = {"A", "B", "C", "D"};
        Set<String> states = new HashSet<>();
        for (String s : positions) {states.add(s); }

        HashMap<Tuple<String, Character>, String> transitions = new HashMap<>();
        transitions.put(new Tuple<>("A", 'a'), "B");
        transitions.put(new Tuple<>("A", 'b'), "C");
        transitions.put(new Tuple<>("B", 'a'), "C");
        transitions.put(new Tuple<>("B", 'b'), "D");
        transitions.put(new Tuple<>("C", 'a'), "D");
        transitions.put(new Tuple<>("D", 'a'), "C");

        String q0 = "A";

        String[] finalSet = {"D"};
        Set<String> finalStates = new HashSet<>();
        for (String s : finalSet) { finalStates.add(s); }
        
        DFSA machine1 = new DFSA(alphabet, states, transitions, q0, finalStates);
        machine1.displayData();

    }
}
