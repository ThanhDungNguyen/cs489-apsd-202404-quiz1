package edu.miu.cs489.quiz1.model;

public abstract class Channel {
    private String label;

    public Channel() {
        this.label = null;
    }

    public Channel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
