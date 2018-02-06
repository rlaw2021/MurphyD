public class Die {
    private long numberOfSides;
    private long faceUpSide;

    public Die() {
        this.numberOfSides = 6;
        this.faceUpSide = 1;
    }

    public Die(long numberOfSides) {
        if (numberOfSides < 2) {
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
        if (newSides < 2) {
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
}
