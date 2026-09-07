package enumeration_homework;

public enum TrafficLights {
    RED,
    YELLOW,
    GREEN;

    public TrafficLights getNextLight() {
        switch (this) {
            case RED:
                return YELLOW;
            case YELLOW:
                return GREEN;
            default:
                return RED;
        }
    }
}