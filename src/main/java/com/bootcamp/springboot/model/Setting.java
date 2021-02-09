package com.bootcamp.springboot.model;

public class Setting {

    private String label;
    private boolean value;

    public Setting() { }

    public Setting(String label, boolean value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
