package me.dev.zennyel.category;

public class Category {


    private String type;

    private double baseMana;
    private double basePower;
    private double baseHealth;
    private double baseMp;
    private double manaMultiplier;
    private double powerMultiplier;
    private double mpMultiplier;
    private double healthMultiplier;

    private double mobilityMultiplier;
    private double resistanceMultiplier;

    public Category(String type, double baseMana, double basePower, double baseHealth, double baseMp, double manaMultiplier, double powerMultiplier, double mpMultiplier, double healthMultiplier, double mobilityMultiplier, double resistanceMultiplier) {
        this.type = type;
        this.baseMana = baseMana;
        this.basePower = basePower;
        this.baseHealth = baseHealth;
        this.baseMp = baseMp;
        this.manaMultiplier = manaMultiplier;
        this.powerMultiplier = powerMultiplier;
        this.mpMultiplier = mpMultiplier;
        this.healthMultiplier = healthMultiplier;
        this.resistanceMultiplier = resistanceMultiplier;
        this.mobilityMultiplier = mobilityMultiplier;
    }

    public double getMobilityMultiplier() {
        return mobilityMultiplier;
    }

    public void setMobilityMultiplier(double mobilityMultiplier) {
        this.mobilityMultiplier = mobilityMultiplier;
    }

    public double getResistanceMultiplier() {
        return resistanceMultiplier;
    }

    public void setResistanceMultiplier(double resistanceMultiplier) {
        this.resistanceMultiplier = resistanceMultiplier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBaseMana() {
        return baseMana;
    }

    public void setBaseMana(double baseMana) {
        this.baseMana = baseMana;
    }

    public double getBasePower() {
        return basePower;
    }

    public void setBasePower(double basePower) {
        this.basePower = basePower;
    }

    public double getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(double baseHealth) {
        this.baseHealth = baseHealth;
    }

    public double getBaseMp() {
        return baseMp;
    }

    public void setBaseMp(double baseMp) {
        this.baseMp = baseMp;
    }

    public double getManaMultiplier() {
        return manaMultiplier;
    }

    public void setManaMultiplier(double manaMultiplier) {
        this.manaMultiplier = manaMultiplier;
    }

    public double getPowerMultiplier() {
        return powerMultiplier;
    }

    public void setPowerMultiplier(double powerMultiplier) {
        this.powerMultiplier = powerMultiplier;
    }

    public double getMpMultiplier() {
        return mpMultiplier;
    }

    public void setMpMultiplier(double mpMultiplier) {
        this.mpMultiplier = mpMultiplier;
    }

    public double getHealthMultiplier() {
        return healthMultiplier;
    }

    public void setHealthMultiplier(double healthMultiplier) {
        this.healthMultiplier = healthMultiplier;
    }
}