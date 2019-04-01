package Exercicio10Mod;

public class Passage {

    private String origin;
    private String destination;
    private Integer points;

    public Passage () {

    }

    public Passage ( String origin, String destination, Integer points ) {
        this.origin = origin;
        this.destination = destination;
        this.points = points;
    }

    public String getOrigin () {
        return origin;
    }

    public String getDestination () {
        return destination;
    }

    public Integer getPoints() {
        return points;

    }
}