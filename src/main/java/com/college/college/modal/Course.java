package com.college.college.modal;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private int cid;
    private String cname;
    private int cduration;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCduration() {
        return cduration;
    }

    public void setCduration(int cduration) {
        this.cduration = cduration;
    }
}
