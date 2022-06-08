package com.example.demo;

public class Plant {
    private String name;
    private String soilType;        // alkaline, neutral, acidic
    private String waterNeeds;      // heavy daily, daily, second-daily
    private boolean isSucculent;    // if it is, prefers dry conditions and well-drained soil, or sandy
    private String sunNeeds;        // full, half, shade
    private Integer squareMeterNeeds;
    private Integer depthNeeds;
    private boolean isClimber;
    private boolean isCreeper;
    private boolean isPerennial;
    private boolean isRootVegetable;
    private Integer growingDepth;   //if it's a root vegetable, this matters
}