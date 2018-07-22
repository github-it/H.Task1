package entity;

public abstract class Transport {
    private long idTransport;
    private String color;
    private int seatCount;
    private int wheelCount;
    private int yearOfCreate;
    private float weight;
    private float engineVolume;
    private double distancePassed;
    private boolean leftSideWheel;
    private boolean navigator;
    private boolean damage;
    private EngineType engineType;
    private BodyType bodyType;
    private Transmission transmission;

    public long getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(long idTransport) {
        this.idTransport = idTransport;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getYearOfCreate() {
        return yearOfCreate;
    }

    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getDistancePassed() {
        return distancePassed;
    }

    public void setDistancePassed(double distancePassed) {
        this.distancePassed = distancePassed;
    }

    public boolean isLeftSideWheel() {
        return leftSideWheel;
    }

    public void setLeftSideWheel(boolean leftSideWheel) {
        this.leftSideWheel = leftSideWheel;
    }

    public boolean isNavigator() {
        return navigator;
    }

    public void setNavigator(boolean navigator) {
        this.navigator = navigator;
    }

    public boolean isDamage() {
        return damage;
    }

    public void setDamage(boolean damage) {
        this.damage = damage;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}
