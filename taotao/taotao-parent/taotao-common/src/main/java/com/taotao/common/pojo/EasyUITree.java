package com.taotao.common.pojo;

/**
 * Easy UI Tree Data
 */
public class EasyUITree {

    //id
    private Integer id;
    //显示名称
    private String text;
    //状态  open or closed
    private String state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
