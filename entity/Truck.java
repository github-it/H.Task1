package entity;

public class Truck extends Transport {
    private float maxWeight;
    private boolean trailer;
    private boolean bioHazard;

    public float getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(float maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isTrailer() {
        return trailer;
    }

    public void setTrailer(boolean trailer) {
        this.trailer = trailer;
    }

    public boolean isBioHazard() {
        return bioHazard;
    }

    public void setBioHazard(boolean bioHazard) {
        this.bioHazard = bioHazard;
    }
}
