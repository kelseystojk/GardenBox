package com.example.demo.controller;

public class GardenBox {

    private Integer length;
    private Integer width;
    private Integer depth;
    private Integer numTypePlants;
    private Integer totalPlants;
    private boolean hasCreeper;
    private boolean hasClimber;
    private String zone;

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getDepth() {
        return depth;
    }

    public Integer getNumTypePlants() {
        return numTypePlants;
    }

    public Integer getTotalPlants() {
        return totalPlants;
    }

    public boolean getHasCreeper() { return hasCreeper; }

    public boolean getHasClimber() { return hasClimber; }

    public String getZone() { return zone; }

    public void setLength(Integer length) {
        this.length = length;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public void setNumTypePlants(Integer numTypePlants) {
        this.numTypePlants = numTypePlants;
    }

    public void setTotalPlants(Integer totalPlants) {
        this.totalPlants = totalPlants;
    }

    public void setHasCreeper(boolean hasCreeper) { this.hasCreeper = hasCreeper; }

    public void setHasClimber(boolean hasClimber) { this.hasClimber = hasClimber; }

    public void setZone(String zone) { this.zone = zone; }

    @java.lang.Override
    public java.lang.String toString() {
        return "GardenBox{" +
                "length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                ", numTypePlants=" + numTypePlants +
                ", totalPlants=" + totalPlants +
                ", hasClimber=" + hasClimber +
                ", hasCreeper=" + hasCreeper +
                ", zone=" + zone +
                '}';
    }

    public Integer totalArea() {
        Integer area = 0;
        area = this.length*this.width;
        return area;
    }

    public Integer totalVolume() {
        Integer volume = 0;
        volume = this.depth*this.width*this.length;
        return volume;
    }

    public String booleanToString(boolean hasAttribute) {
        if (hasAttribute) {
            return "Yes";
        }
        return "No";
    }

}

