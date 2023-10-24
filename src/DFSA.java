import java.util.Set;
import java.util.HashMap;

public class DFSA {

    // Attributes 
    private Set<Character>                              alphabet;         // Σ
    private Set<String>                                 Q;                // States
    private HashMap<Tuple<String, String>, Character>   transitions;      // Connections
    private String                                      q0;               // Start state
    private Set<String>                                 F;                // Final states

    public DFSA(Set<Character> a, Set<String> Q, HashMap<Tuple<String, String>, Character> t, String q, Set<String> F) {
        this.alphabet = a;
        this.Q = Q;
        this.transitions = t;
        this.q0 = q;
        this.F = F;
    }

    // Getters
    public Set<Character> getAlphabet() { return alphabet; }
    public Set<String> getQ() { return Q; }
    public HashMap<Tuple<String, String>, Character> getTransitions() { return transitions; }
    public String getq0() { return q0; }
    public Set<String> getF() { return F; }

    // Setters
    public void setAlphabet(Set<Character> alphabet) { this.alphabet = alphabet; }
    public void setQ(Set<String> Q) { this.Q = Q; }
    public void setTransitions(HashMap<Tuple<String, String>, Character> transitions) { this.transitions = transitions; }
    public void setq0(String q0) { this.q0 = q0; }
    public void setF(Set<String> F) { this.F = F; }
    
}