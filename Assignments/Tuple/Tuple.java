public class Tuple {
    private int[] tuple;

    public Tuple (int k) {
        if (k < 0) {
            throw new IllegalArgumentException();
        }
        tuple = new int[k];
        for (int i = 0; i <= tuple.length - 1; i++) {
            tuple[i] = 0;
        }
    }

    public Tuple (int[] data) {
        tuple = new int[data.length];
        for (int i = 0; i <= data.length - 1; i++) {
            tuple[i] = data[i];
        }
    }

    public static Tuple makeTupleFromData (int[] data) {
        return new Tuple(data);
    }

    public Tuple add (Tuple t) {
        int[] tupleArray;
        if (this.length() != t.length()) {
            throw new IllegalArgumentException();
        }
        tupleArray = new int[this.length()];
        for (int i = 0; i <= this.length() - 1; i++) {
            tupleArray[i] = this.tuple[i] + t.tuple[i];
        }
        return new Tuple(tupleArray);
    }

    public Tuple clone() {
        throw new UnsupportedOperationException();
    }

    public boolean equals (Object obj) {
        throw new UnsupportedOperationException();
    }

    public int getElement (int i) {
        return this.tuple[i];
    }

    public void setElement (int i, int value) {
        throw new UnsupportedOperationException();
    }

    public int length() {
        return this.tuple.length;
    }

    public int sum() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        throw new UnsupportedOperationException();
    }
}
