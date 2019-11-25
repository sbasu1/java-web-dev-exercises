package org.launchcode.java.demos.lsn6inheritance.technology;

public class Computer extends AbstractEntity{
    private int ramSize;
    private int hardDiskSize;
    private String osName;
    public Computer(int ramSize, int hardDiskSize, String osName,int id) {
        super(id);
        this.ramSize = ramSize;
        this.hardDiskSize = hardDiskSize;
        this.osName = osName;
    }

    public int getRamSize() {
        return this.ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(int hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }
}
