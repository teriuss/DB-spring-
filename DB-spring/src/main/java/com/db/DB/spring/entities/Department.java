package com.db.DB.spring.entities;

import com.db.DB.spring.models.EmployeeModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Department {
    @Id
    private int Dnumber;
    private String Dname;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Mgr_ssn")
    private Employee Mgr_ssn;
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
    public Employee getMgr_ssn() {
        return Mgr_ssn;
    }
    public void setMgr_ssn(Employee mgr_ssn) {
        Mgr_ssn = mgr_ssn;
    }
    public Date getMgr_start_date() {
        return Mgr_start_date;
    }
    public void setMgr_start_date(Date mgr_start_date) {
        Mgr_start_date = mgr_start_date;
    }


    public void setMrg_ssn(Employee one) {
    }
}


