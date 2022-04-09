package com.db.DB.spring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
    public class Employee {
        @Id
        private String Ssn;

        private String Fname;

        private String Lname;

        private Date Bdate;

        private String Address;

        private String Sex;

        private Double Salary;

    public String getSsn() {
            return Ssn;
        }
        public void setSsn(String ssn) {
            Ssn = ssn;
        }
        public String getFname() {
            return Fname;
        }
        public void setFname(String fname) {
            Fname = fname;
        }
        public String getLname() {
            return Lname;
        }
        public void setLname(String lname) {
            Lname = lname;
        }
        public Date getBdate() {
            return Bdate;
        }
        public void setBdate(Date bdate) {
            Bdate = bdate;
        }
        public String getAddress() {
            return Address;
        }
        public void setAddress(String address) {
            Address = address;
        }
        public String getSex() {
            return Sex;
        }
        public void setSex(String sex) {
            Sex = sex;
        }
        public Double getSalary() {
            return Salary;
        }
        public void setSalary(Double salary) {
            Salary = salary;
        }


    }
