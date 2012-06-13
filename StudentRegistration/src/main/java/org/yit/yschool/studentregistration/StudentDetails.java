/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yit.yschool.studentregistration;

/**
 *
 * @author sujewan
 */
public class StudentDetails 
{
    private String StudentName;
    private String Address;
    private String Grade;
    private String ParentName;

    /**
     * @return the StudentName
     */
    public String getStudentName() {
        return StudentName;
    }

    /**
     * @param StudentName the StudentName to set
     */
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Grade
     */
    public String getGrade() {
        return Grade;
    }

    /**
     * @param Grade the Grade to set
     */
    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    /**
     * @return the ParentName
     */
    public String getParentName() {
        return ParentName;
    }

    /**
     * @param ParentName the ParentName to set
     */
    public void setParentName(String ParentName) {
        this.ParentName = ParentName;
    }
}
