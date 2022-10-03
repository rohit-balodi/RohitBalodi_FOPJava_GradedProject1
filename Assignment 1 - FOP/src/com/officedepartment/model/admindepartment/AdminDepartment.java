package com.officedepartment.model.admindepartment;

import com.officedepartment.model.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

    public String departmentName () {
        String name = "Welcome to Admin Department!";
        return name;
    }

    public String getTodaysWork () {
        String todaysWork = "Complete your documents Submission!";
        return todaysWork;
    }

    public String getWorkDeadline () {
        String workDeadline = "Complete by EOD!";
        return workDeadline;
    }

}
