package com.bootcamp.springboot.model;

import java.util.List;

public class Settings {

    private List<SettingsGroup> groupList;

    public Settings() {}

    public Settings(List<SettingsGroup> groupList) {
        this.groupList = groupList;
    }

    public List<SettingsGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<SettingsGroup> groupList) {
        this.groupList = groupList;
    }
}
