package com.solvd.model;

import java.sql.Date;

public class Schedule {
    private int id;
    private int subject_id;
    private int group_id;
    private Date date;
    private int teacher_id;
    private int auditory_id;

    public int getId() {
        return id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public Date getDate() {
        return date;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public int getAuditory_id() {
        return auditory_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setAuditory_id(int auditory_id) {
        this.auditory_id = auditory_id;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id=" + id +
                ", subject_id=" + subject_id +
                ", group_id=" + group_id +
                ", date=" + date +
                ", teacher_id=" + teacher_id +
                ", auditory_id=" + auditory_id +
                '}';
    }
}
