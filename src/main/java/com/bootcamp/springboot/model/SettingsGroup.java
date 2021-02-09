package com.bootcamp.springboot.model;

import java.util.List;

public class SettingsGroup {

    private String group;
    private List<Setting> settingList;

    public SettingsGroup() {}

    public SettingsGroup(String group, List<Setting> settingList) {
        this.group = group;
        this.settingList = settingList;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public List<Setting> getSettingList() {
        return settingList;
    }

    public void setSettingList(List<Setting> settingList) {
        this.settingList = settingList;
    }
}
