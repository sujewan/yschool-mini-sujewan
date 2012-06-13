package org.yit.yschool.dao;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author Sujewan
 */
@Entity
@Table (name ="Student")
public class student implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name = "SID")
    private int studentID;        
    @Column(name = "StudentName")
    private String studentName;
    @Column(name = "Address")
    private String address;
    @Column(name = "Grade")
    private int grade;
    @Column(name = "ParentName")
    private String parentName;

    public student() {
    }

    public student(String sName, String address, int grade, String pName) {
        this.studentName = sName;
        this.grade = grade;
        this.address = address;
        this.parentName = pName;
    }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * @param studentName the studentName to set
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the parentName
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * @param parentName the parentName to set
     */
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

}
