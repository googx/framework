package com.gfyt.core.bean.entity;

import com.gfyt.core.bean.entity.core.BaseEntity;

public class Test1 extends BaseEntity {
    private Integer tid;

    private String tname;

    public Test1(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public Test1() {
        super();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }
}