/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yit.student;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Sujewan
 */
@ManagedBean 
@SessionScoped
public class UserBean 
{
    private String studentName;
    private String address;
    private String grade;
    private String parentName;

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
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
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
    
    
    public String addConfirm()
    {
        boolean added = true; 
        FacesMessage doneMessage = null;
        String outcome = null;
        
        if (added)
        {
            doneMessage = new FacesMessage("Successfully added");
            outcome = "done";
        }
        else
        {
            doneMessage = new FacesMessage("Failed to add new student");
            outcome = "register";
        }
        FacesContext.getCurrentInstance().addMessage(null, doneMessage);
        return outcome;
    }
}
