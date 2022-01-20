package com.solvd.model;

public class Subject {
    private int id;
    private int teacher_id;
    private String subjectName;

    public int getId() {
        return id;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", teacher_id=" + teacher_id +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
