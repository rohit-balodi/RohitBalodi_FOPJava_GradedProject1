package com.officedepartment.model.techdepartment;

import com.officedepartment.model.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {

    public String departmentName () {
        String name = "Welcome to Tech Department!";
        return name;
    }

    public String getTodaysWork () {
        String todaysWork = "Complete coding of module 1!";
        return todaysWork;
    }

    public String getWorkDeadline () {
        String workDeadline = "Complete by EOD!";
        return workDeadline;
    }

    public String getTechStackInformation () {
        String getInfomation = "Core Java!";
        return getInfomation;
    }

}
