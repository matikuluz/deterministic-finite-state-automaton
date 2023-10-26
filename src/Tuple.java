// Code from: https://stackoverflow.com/questions/2670982/using-pairs-or-2-tuples-in-java

public class Tuple<X, Y> { 

    // Attributes
    public final X x; 
    public final Y y; 

    public Tuple(X x, Y y) { 

        this.x = x; 
        this.y = y; 
    
    }
    
    public String toString() {
      return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tuple<?, ?> other = (Tuple<?, ?>) obj;
        return (this.x != null ? this.x.equals(other.x) : other.x == null) &&
                (this.y != null ? this.y.equals(other.y) : other.y == null);
    }

} 