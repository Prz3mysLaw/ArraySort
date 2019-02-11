public class Pair {

    private final int index;
    private final int value;

    public Pair(int index, int value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        int result = index;
        result = 31 * result + value;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Pair pair = (Pair) obj;

        if (index != pair.index) return false;
        return value == pair.value;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
