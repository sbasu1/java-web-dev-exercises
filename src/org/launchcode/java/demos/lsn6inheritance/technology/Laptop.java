package org.launchcode.java.demos.lsn6inheritance.technology;

public class Laptop extends Computer{
    private boolean isFoldable;
    private boolean isTouchEnable;

    public Laptop(int ramSize, int hardDiskSize, String osName, boolean isFoldable, boolean isTouchEnable,int id) {
        super(ramSize, hardDiskSize, osName,id);
        this.isFoldable = isFoldable;
        this.isTouchEnable = isTouchEnable;
    }

    public boolean isFoldable() {
        return this.isFoldable;
    }

    public void setFoldable(boolean foldable) {
        this.isFoldable = foldable;
    }

    public boolean isTouchEnable() {
        return this.isTouchEnable;
    }

    public void setTouchEnable(boolean touchEnable) {
        this.isTouchEnable = touchEnable;
    }
}
