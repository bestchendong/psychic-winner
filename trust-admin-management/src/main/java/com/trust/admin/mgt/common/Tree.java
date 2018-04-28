package com.trust.admin.mgt.common;

import java.io.Serializable;
import java.util.List;

public class Tree implements Serializable{

    private String id;
    private String text;
    private String state="open";
    private boolean checked = false;
    private Object attributes;
    private List<Tree> children;
    private String iconCls;
    private String pid;
    private int level;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getState() {
        return state;
    }

    public boolean isChecked() {
        return checked;
    }

    public Object getAttributes() {
        return attributes;
    }

    public List<Tree> getChildren() {
        return children;
    }

    public String getIconCls() {
        return iconCls;
    }

    public String getPid() {
        return pid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public void setChildren(List<Tree> children) {
        this.children = children;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
