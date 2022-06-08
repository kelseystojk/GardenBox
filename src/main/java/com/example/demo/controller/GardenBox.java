package com.example.demo.controller;

public class GardenBox {

    private Integer length;
    private Integer width;
    private Integer depth;
    private Integer numTypePlants;
    private Integer totalPlants;

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

    @java.lang.Override
    public java.lang.String toString() {
        return "GardenBox{" +
                "length=" + length +
                ", width=" + width +
                ", depth=" + depth +
                ", numTypePlants=" + numTypePlants +
                ", totalPlants=" + totalPlants +
                '}';
    }

}

