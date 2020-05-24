package com.tg.domain;

import java.util.Date;

/**
 * @Description: Emp
 * @Author: tanggang@xiangzhitech.com
 * @Date: 2020/5/23
 * @Version: 1.0
 */
public class Emp {
    private Integer id;
    private String ename;
    private Integer job_id;
    private Integer mgr;
    private Date joindate;
    private Double salary;
    private Double bonus;
    private Integer DEPT_id;

    public Emp() {
    }

    public Emp(Integer id, String ename, Integer job_id, Integer mgr, Date joindate, Double salary, Double bonus, Integer DEPT_id) {
        this.id = id;
        this.ename = ename;
        this.job_id = job_id;
        this.mgr = mgr;
        this.joindate = joindate;
        this.salary = salary;
        this.bonus = bonus;
        this.DEPT_id = DEPT_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getJob_id() {
        return job_id;
    }

    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getJoindate() {
        return joindate;
    }

    public void setJoindate(Date joindate) {
        this.joindate = joindate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Integer getDEPT_id() {
        return DEPT_id;
    }

    public void setDEPT_id(Integer DEPT_id) {
        this.DEPT_id = DEPT_id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                ", job_id=" + job_id +
                ", mgr=" + mgr +
                ", joindate=" + joindate +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", DEPT_id=" + DEPT_id +
                '}';
    }
}
