/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.cibertec.javaadv.mod4.asistencias;

import java.util.Date;
import java.util.List;

/**
 *
 * @author JAVA-ADV
 */
public class ClassEvent {

    private Date firstTime;
    private Date dueTime;
    private Date teacherChekinTime;
    private Date begin;
    private Date end;
    private Teacher teacher;
    private String topic;
    private Course course;
    private List<ClassEventDetail> details;

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<ClassEventDetail> getDetails() {
        return details;
    }

    public void setDetails(List<ClassEventDetail> details) {
        this.details = details;
    }

    public Date getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(Date firstTime) {
        this.firstTime = firstTime;
    }

    public Date getDueTime() {
        return dueTime;
    }

    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }

    public Date getTeacherChekinTime() {
        return teacherChekinTime;
    }

    public void setTeacherChekinTime(Date teacherChekinTime) {
        this.teacherChekinTime = teacherChekinTime;
    }
}
