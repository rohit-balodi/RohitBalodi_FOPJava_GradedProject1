package com.officedepartment.main;

import com.officedepartment.model.admindepartment.AdminDepartment;
import com.officedepartment.model.hrdepartment.HrDepartment;
import com.officedepartment.model.techdepartment.TechDepartment;

public class OfficeDepartment {
    public static void main (String[] args) {

//        SuperDepartment superdepartmentinfo = new SuperDepartment ();    // Accessing superclass object.
//        System.out.println (superdepartmentinfo.departmentName ());
//        System.out.println (superdepartmentinfo.getTodaysWork ());
//        System.out.println (superdepartmentinfo.getWorkDeadline ());
//        System.out.println (superdepartmentinfo.isTodayAHoliday ());

        System.out.println ();  // new line printed

        AdminDepartment admininfo = new AdminDepartment ();    // Creating superclass object.
        System.out.println (admininfo.departmentName ());
        System.out.println (admininfo.getTodaysWork ());
        System.out.println (admininfo.getWorkDeadline ());
        System.out.println (admininfo.isTodayAHoliday ());    // Accessing superclass object.

        System.out.println ();  // new line printed

        HrDepartment hrinfo = new HrDepartment ();    // Creating superclass object.
        System.out.println (hrinfo.departmentName ());
        System.out.println (hrinfo.doActivity ());
        System.out.println (hrinfo.getTodaysWork ());
        System.out.println (hrinfo.getWorkDeadline ());
        System.out.println (hrinfo.isTodayAHoliday ());    // Accessing superclass object.

        System.out.println ();  // new line printed

        TechDepartment techinfo = new TechDepartment ();    // Creating superclass object.
        System.out.println (techinfo.departmentName ());
        System.out.println (techinfo.getTodaysWork ());
        System.out.println (techinfo.getWorkDeadline ());
        System.out.println (techinfo.getTechStackInformation ());
        System.out.println (techinfo.isTodayAHoliday ());    // Accessing superclass object.

        System.out.println ();  // new line printed

    }
}
