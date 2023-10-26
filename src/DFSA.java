import java.util.Set;
import java.util.HashMap;

public class DFSA {

    // Attributes 
    private Set<Character>                                  alphabet;         // Σ
    private Set<String>                                     Q;                // States
    private HashMap<Tuple<String, Character>, String>       transitions;      // Connections
    private String                                          q0;               // Start state
    private Set<String>                                     F;                // Final states

    public DFSA(Set<Character> a, Set<String> Q, HashMap<Tuple<String, Character>, String> t, String q, Set<String> F) {
        this.alphabet = a;
        this.Q = Q;
        this.transitions = t;
        this.q0 = q;
        this.F = F;
    }

    // Getters
    public Set<Character> getAlphabet() { return alphabet; }
    public Set<String> getQ() { return Q; }
    public HashMap<Tuple<String, Character>, String> getTransitions() { return transitions; }
    public String getq0() { return q0; }
    public Set<String> getF() { return F; }

    // Setters
    public void setAlphabet(Set<Character> alphabet) { this.alphabet = alphabet; }
    public void setQ(Set<String> Q) { this.Q = Q; }
    public void setTransitions(HashMap<Tuple<String, Character>, String> transitions) { this.transitions = transitions; }
    public void setq0(String q0) { this.q0 = q0; }
    public void setF(Set<String> F) { this.F = F; }
    
    public void displayData() {
        System.out.println("Alphabet (Σ): " + alphabet);
        System.out.println("States (Q): " + Q);
        System.out.println("Transitions: " + transitions);
        System.out.println("Start State (q0): " + q0);
        System.out.println("Final States (F): " + F);
    }

    public String process(String input) {
        if (input.length() == 0) { return this.q0; } // Base case

        boolean crash = false;
        int pointer = 0;
        String currentState = this.q0;
        char currentChar;
        Tuple<String, Character> connection;
        String result = "";

        while (!crash && pointer < input.length()){

            result = "";
            currentChar = (char)input.charAt(pointer);
            connection = new Tuple<>(currentState, currentChar);
            // Search for connection
            for (Tuple<String, Character> key : transitions.keySet()) {
                if (key.equals( connection )) {
                    result = transitions.get( key );
                    break;
                }
            }
            // If no connection found, crash
            if (result == ""){ 
                crash = true; 
                result = "Crash";
                break;
            }
            else {
                // Moving to next state
                currentState = result;
            }
            pointer++;
        }
        return result;
    }
}