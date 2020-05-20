package com.optum.sprboot.jpatest.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity(name="block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private Integer mbr_sk;
    private Integer room_id;
    private Integer blockholder_id;
    private String start_tm;
    private String end_tm;
    private Date effective_start_dt;
    private Date effective_end_dt;
    private Integer day_of_week;
    private Integer week_of_month;
    private String active_flg;
    private Date update_dt;
    private String recurrence;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMbr_sk() {
        return mbr_sk;
    }

    public void setMbr_sk(Integer mbr_sk) {
        this.mbr_sk = mbr_sk;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public Integer getBlockholder_id() {
        return blockholder_id;
    }

    public void setBlockholder_id(Integer blockholder_id) {
        this.blockholder_id = blockholder_id;
    }

    public String getStart_tm() {
        return start_tm;
    }

    public void setStart_tm(String start_tm) {
        this.start_tm = start_tm;
    }

    public String getEnd_tm() {
        return end_tm;
    }

    public void setEnd_tm(String end_tm) {
        this.end_tm = end_tm;
    }

    public Date getEffective_start_dt() {
        return effective_start_dt;
    }

    public void setEffective_start_dt(Date effective_start_dt) {
        this.effective_start_dt = effective_start_dt;
    }

    public Date getEffective_end_dt() {
        return effective_end_dt;
    }

    public void setEffective_end_dt(Date effective_end_dt) {
        this.effective_end_dt = effective_end_dt;
    }

    public Integer getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(Integer day_of_week) {
        this.day_of_week = day_of_week;
    }

    public Integer getWeek_of_month() {
        return week_of_month;
    }

    public void setWeek_of_month(Integer week_of_month) {
        this.week_of_month = week_of_month;
    }

    public String getActive_flg() {
        return active_flg;
    }

    public void setActive_flg(String active_flg) {
        this.active_flg = active_flg;
    }

    public Date getUpdate_dt() {
        return update_dt;
    }

    public void setUpdate_dt(Date update_dt) {
        this.update_dt = update_dt;
    }

    public String getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    public  Block(){

    }

}
