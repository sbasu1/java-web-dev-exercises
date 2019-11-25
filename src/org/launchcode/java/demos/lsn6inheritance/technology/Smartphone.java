package org.launchcode.java.demos.lsn6inheritance.technology;

public class Smartphone extends Computer{
    private boolean hasHomeButton;

    public Smartphone(int ramSize, int hardDiskSize, String osName, boolean hasHomeButton, int id) {
        super(ramSize, hardDiskSize, osName,id);
        this.hasHomeButton = hasHomeButton;
    }

    public boolean isHasHomeButton() {
        return hasHomeButton;
    }

    public void setHasHomeButton(boolean hasHomeButton) {
        this.hasHomeButton = hasHomeButton;
    }
}
