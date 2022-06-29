package com.example.demo.controller;

import com.example.demo.Plant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GardenBox {
    private Integer length;
    private Integer width;
    private Integer depth;
    private Integer numTypePlants;
    private Integer totalPlants;
    private boolean hasCreeper;
    private boolean hasClimber;
    private String zone;
    private List<Plant> plants;

    private String fullSunExposure;
    private String fullShadeExposure;
    public GardenBox() {
        plants = Arrays.asList(
                new Plant("Tomato", "acidic", 0, "full", 15, 30, 450, "NA", true, false, false, false, false),
                new Plant("Potato", "neutral-acidic", 1, "full", 60, 30, 1800, "4a", false, false, true, true, false),
                new Plant("Giant Sunflower", "neutral", 1, "full", 60, 60, 3600, "2a", false, false, true, false, false),
                new Plant("Kabocha", "neutral-acidic", 6, "full", 12, 60, 720, "3a", false, true, false, false, false)
        );
    }

    public List<Plant> getPlants() { return plants; }

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

    public String getFullSunExposure() {
        return fullSunExposure;
    }

    public String getFullShadeExposure() {
        return fullShadeExposure;
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

    public void setHasCreeper(boolean hasCreeper) { this.hasCreeper = hasCreeper; }

    public void setHasClimber(boolean hasClimber) { this.hasClimber = hasClimber; }

    public void setZone(String zone) { this.zone = zone; }

    public void setPlants(List<Plant> plants) { this.plants = plants;  }

    public void setFullSunExposure(String fullSunExposure) {
        this.fullSunExposure = fullSunExposure;
    }

    public void setFullShadeExposure(String fullShadeExposure) {
        this.fullShadeExposure = fullShadeExposure;
    }

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
                ", plants=" + plants +
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

    public boolean verifyAllPlantsWillFitByArea() {
        Integer totalPlantArea = 0;
        for (int i = 0; i < this.plants.size(); i++) {
            if (Integer.parseInt(plants.get(i).getQuantity()) > 0) {
                totalPlantArea += (plants.get(i).getRequiredArea() * Integer.parseInt(plants.get(i).getQuantity()));
            }
        }
        Integer gardenBoxArea = 0;
        gardenBoxArea = this.length*this.width;
        System.out.println("Garden box area: " + gardenBoxArea + " and total plant area: " + totalPlantArea);
        if (gardenBoxArea >= totalPlantArea) {
            return true;
        }
        return false;
    }

    public boolean verifyAllPlantsWillFitByDepth() {
        Integer maxPlantDepth = 0;
        // first find the initial depth required for first plant in list (since some may have quantity of 0)
        for (int i = 0; i < this.plants.size(); i++) {
            if (Integer.parseInt(plants.get(i).getQuantity()) > 0) {
                maxPlantDepth = plants.get(i).getRequiredDepth();
                break;
            }
        }
        //todo>>> this checks the same plant again, can it be more efficient?
        for (int i = 0; i < this.plants.size(); i++) {
            if (Integer.parseInt(plants.get(i).getQuantity()) > 0) {
                if (plants.get(i).getRequiredDepth() > maxPlantDepth) {
                    maxPlantDepth = plants.get(i).getRequiredDepth();
                }
            }
        }
        System.out.println("Garden box depth: " + this.getDepth() + " and max plant depth: " + maxPlantDepth);
        if (this.getDepth() >= maxPlantDepth) {
            return true;
        }
        return false;
    }

    //this method is actually a bit redundant but may help the user
    public boolean verifyAllPlantsWillFitByVolume() {
        Integer totalPlantVol = 0;
        for (int i = 0; i < this.plants.size(); i++) {
            if (Integer.parseInt(plants.get(i).getQuantity()) > 0) {
                totalPlantVol += (plants.get(i).getRequiredVolume() * Integer.parseInt(plants.get(i).getQuantity()));
            }
        }
        Integer gardenBoxVol = 0;
        gardenBoxVol = this.length*this.width*this.depth;
        System.out.println("Garden box volume: " + gardenBoxVol + " and total plant area: " + totalPlantVol);
        if (gardenBoxVol >= totalPlantVol) {
            return true;
        }
        return false;
    }

}

