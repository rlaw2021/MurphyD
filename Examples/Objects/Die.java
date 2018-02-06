public class Die {
    private long numberOfSides;
    private long faceUpSide;
    public static final long DEFAULT_NUMBER_OF_SIDES = 6;
    public static final long MINIMUM_NUMBER_OF_SIDES = 2;

    public Die() {
        this.numberOfSides = DEFAULT_NUMBER_OF_SIDES;
        this.faceUpSide = 1;
    }

    public Die(long numberOfSides) {
        if (numberOfSides < MINIMUM_NUMBER_OF_SIDES) {
            throw new IllegalArgumentException();
        }
        this.numberOfSides = numberOfSides;
        this.faceUpSide = 1;
    }

    public long getNumberOfSides() {
        return this.numberOfSides;
    }

    public long getFaceUpSide() {
        return this.faceUpSide;
    }

    public void setNumberOfSides(long newSides) {
        if (newSides < MINIMUM_NUMBER_OF_SIDES) {
            throw new IllegalArgumentException();
        }
        numberOfSides = newSides;
        if (faceUpSide > newSides) {
            faceUpSide = 1;
        }
    }

    public void setFaceUpSide(long newFaceUpSide) {
        if (newFaceUpSide < 1 || newFaceUpSide > numberOfSides) {
            throw new IllegalArgumentException();
        }
        faceUpSide = newFaceUpSide;
    }

    public long roll() {
        this.faceUpSide = (long)Math.floor((Math.random() * this.numberOfSides) + 1);
        return faceUpSide;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Die other = (Die)obj;
        return (this.numberOfSides == other.numberOfSides)
                && (this.faceUpSide == other.faceUpSide);
    }

    @Override
    public String toString() {
        return "D" + this.numberOfSides + ": " + this.faceUpSide;
    }
}
