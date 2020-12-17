package semiproject;

import JSB.JDBCUtil;

public class EmployeeJDBC extends JDBCUtil {
    public static String insertEmp = "insert  into employees values (?,?,?,?,?,?,?,?,?,?,?)";
    public static String selectEmp = " select employee_id,last_name,email,job_id,manager_id,department_id " +
            " from employees ";
    public static String selectOneEmp = "select * from employees where employee_id = ?";

}
