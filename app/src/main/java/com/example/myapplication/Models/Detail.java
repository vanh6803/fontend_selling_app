package com.example.myapplication.Models;

class Detail {
    private String screenTechnology;
    private double screenSize;
    private String screenFeatures;
    private String screenType;
    private String rearCamera;
    private String frontCamera;
    private String chipset;
    private String cpu;
    private String gpu;
    private int ram;
    private int rom;
    private int battery;
    private String operatingSystem;
    private String internet;
    private int weight;
    private String audioTechnology;
    private String specialFeatures;

    public Detail() {
    }

    public Detail(String screenTechnology, double screenSize, String screenFeatures, String screenType, String rearCamera, String frontCamera, String chipset, String cpu, String gpu, int ram, int rom, int battery, String operatingSystem, String internet, int weight, String audioTechnology, String specialFeatures) {
        this.screenTechnology = screenTechnology;
        this.screenSize = screenSize;
        this.screenFeatures = screenFeatures;
        this.screenType = screenType;
        this.rearCamera = rearCamera;
        this.frontCamera = frontCamera;
        this.chipset = chipset;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.rom = rom;
        this.battery = battery;
        this.operatingSystem = operatingSystem;
        this.internet = internet;
        this.weight = weight;
        this.audioTechnology = audioTechnology;
        this.specialFeatures = specialFeatures;
    }

    public String getScreenTechnology() {
        return screenTechnology;
    }

    public void setScreenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenFeatures() {
        return screenFeatures;
    }

    public void setScreenFeatures(String screenFeatures) {
        this.screenFeatures = screenFeatures;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getRearCamera() {
        return rearCamera;
    }

    public void setRearCamera(String rearCamera) {
        this.rearCamera = rearCamera;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getAudioTechnology() {
        return audioTechnology;
    }

    public void setAudioTechnology(String audioTechnology) {
        this.audioTechnology = audioTechnology;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }
}