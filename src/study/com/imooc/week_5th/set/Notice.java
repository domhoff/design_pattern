package com.imooc.week_5th.set;

import java.util.Date;

/**
 * @version 1.0
 * @author: dell-6530
 * @date: 2020/12/18
 * @description:
 */

public class Notice {

    private  int id;
    private String  title;
    private String  create;
    private Date   date;

    public Notice(int id, String title, String create, Date date) {
        this.id = id;
        this.title = title;
        this.create = create;
        this.date = date;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
