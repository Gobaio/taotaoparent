package com.taotao.common.pojo;

public class EasyUITreeNode {
    private Long id;
    private String text;
    private String state;//closed:父节点 open：叶子节点

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
