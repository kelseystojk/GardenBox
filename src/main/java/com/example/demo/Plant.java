package com.example.demo;

public class Plant {

    public String getName() {
        return name;
    }

    public String getSoilType() {
        return soilType;
    }

    public Integer getDaysBetweenWatering() {
        return daysBetweenWatering;
    }

    public String getRequiredSun() {
        return requiredSun;
    }

    public Integer getRequiredDepth() {
        return requiredDepth;
    }

    public Integer getRequiredArea() {
        return requiredArea;
    }

    public Integer getRequiredVolume() {
        return requiredVolume;
    }

    public String getMinHardinessZone() {
        return minHardinessZone;
    }

    public boolean isClimber() {
        return isClimber;
    }

    public boolean isCreeper() {
        return isCreeper;
    }

    public boolean isPerennial() {
        return isPerennial;
    }

    public boolean isRootVegetable() {
        return isRootVegetable;
    }

    public boolean isSucculent() {
        return isSucculent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public void setDaysBetweenWatering(Integer daysBetweenWatering) {
        this.daysBetweenWatering = daysBetweenWatering;
    }

    public void setRequiredSun(String requiredSun) {
        this.requiredSun = requiredSun;
    }

    public void setRequiredDepth(Integer requiredDepth) {
        this.requiredDepth = requiredDepth;
    }

    public void setRequiredArea(Integer requiredArea) {
        this.requiredArea = requiredArea;
    }

    public void setRequiredVolume(Integer requiredVolume) {
        this.requiredVolume = requiredVolume;
    }

    public void setMinHardinessZone(String minHardinessZone) {
        this.minHardinessZone = minHardinessZone;
    }

    public void setClimber(boolean climber) {
        isClimber = climber;
    }

    public void setCreeper(boolean creeper) {
        isCreeper = creeper;
    }

    public void setPerennial(boolean perennial) {
        isPerennial = perennial;
    }

    public void setRootVegetable(boolean rootVegetable) {
        isRootVegetable = rootVegetable;
    }

    public void setSucculent(boolean succulent) {
        isSucculent = succulent;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;
    private String soilType;        // alkaline, neutral, acidic
    private Integer daysBetweenWatering;      // heavy daily, daily, second-daily
    private String requiredSun;        // full, half, shade
    private Integer requiredDepth;   //if it's a root vegetable, this matters
    private Integer requiredArea;
    private Integer requiredVolume;
    private String  minHardinessZone;
    private boolean isClimber;
    private boolean isCreeper;
    private boolean isPerennial;
    private boolean isRootVegetable;
    private boolean isSucculent;    // if it is, prefers dry conditions and well-drained soil, or sandy

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, String soilType,
                 Integer daysBetweenWatering, String requiredSun,
                 Integer requiredDepth, Integer requiredArea,
                 Integer requiredVolume, String minHardinessZone,
                 boolean isClimber, boolean isCreeper,
                 boolean isPerennial, boolean isRootVegetable,
                 boolean isSucculent) {
        this.name = name;
        this.soilType = soilType;
        this.daysBetweenWatering = daysBetweenWatering;
        this.requiredSun = requiredSun;
        this.requiredDepth = requiredDepth;
        this.requiredArea = requiredArea;   //maybe this should be called requiredSpacing?
        this.requiredVolume = requiredVolume;
        this.minHardinessZone = minHardinessZone;
        this.isClimber = isClimber;
        this.isCreeper = isCreeper;
        this.isPerennial = isPerennial;
        this.isRootVegetable = isRootVegetable;
        this.isSucculent = isSucculent;
    }

}