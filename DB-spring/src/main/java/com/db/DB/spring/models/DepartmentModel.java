package com.db.DB.spring.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class DepartmentModel {
    private int Dnumber;
    private String Dname;
    private String Mgr_id;
    private EmployeeModel Mgr_ssn;
    private Date Mgr_start_date;
    public int getDnumber() {
        return Dnumber;
    }
    public void setDnumber(int dnumber) {
        Dnumber = dnumber;
    }
    public String getDname() {
        return Dname;
    }
    public void setDname(String dname) {
        Dname = dname;
    }
    public String getMgr_id() {
        return Mgr_id;
    }
    public void setMgr_id(String mgr_id) {
        Mgr_id = mgr_id;
    }
    public EmployeeModel getMgr_ssn() {
        return Mgr_ssn;
    }
    public void setMgr_ssn(EmployeeModel mgr_ssn) {
        Mgr_ssn = mgr_ssn;
    }
    public Date getMgr_start_date() {
        return Mgr_start_date;
    }
    public void setMgr_start_date(Date mgr_start_date) {
        Mgr_start_date = mgr_start_date;
    }
}
