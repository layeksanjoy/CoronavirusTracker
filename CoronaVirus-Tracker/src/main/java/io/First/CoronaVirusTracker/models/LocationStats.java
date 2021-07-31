package io.First.CoronaVirusTracker.models;

public class LocationStats {

    // == Private Fields == //
    private String state;
    private String country;
    private int LatestTotalCases;
    private int prevDay;

    public int getPrevDay() {
        return prevDay;
    }

    public void setPrevDay(int prevDay) {
        this.prevDay = prevDay;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getLatestTotalCases() {
        return LatestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        LatestTotalCases = latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", LatestTotalCases=" + LatestTotalCases +
                '}';
    }
}
