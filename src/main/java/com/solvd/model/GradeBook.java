package com.solvd.model;

import java.sql.Date;

public class GradeBook {
    private int id;
    private int student_id;
    private int teacher_id;
    private int mark;
    private Date date;
    private int subject_id;

    public int getId() {
        return id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public int getMark() {
        return mark;
    }

    public Date getDate() {
        return date;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    @Override
    public String toString() {
        return "GradeBook{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", teacher_id=" + teacher_id +
                ", mark=" + mark +
                ", date=" + date +
                ", subject_id=" + subject_id +
                '}';
    }
}
