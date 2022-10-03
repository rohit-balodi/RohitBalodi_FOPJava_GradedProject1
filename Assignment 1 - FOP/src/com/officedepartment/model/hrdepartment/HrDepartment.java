package com.officedepartment.model.hrdepartment;

import com.officedepartment.model.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {

    public String departmentName () {
        String name = "Welcome to HR Department!";
        return name;
    }

    public String getTodaysWork () {
        String todaysWork = "Fill today’s timesheet and mark your attendance!";
        return todaysWork;
    }

    public String getWorkDeadline () {
        String workDeadline = "Complete by EOD!";
        return workDeadline;
    }

    public String doActivity () {
        String activity = "Team Lunch!";
        return activity;

    }

}
