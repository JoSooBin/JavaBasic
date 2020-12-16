package semiproject;

import JSB.JDBCUtil;

public class EmployeeJDBC extends JDBCUtil {
    public static String insertEmp = "";
    public static String selectEmp = " select employee_id,last_name,email,job_id,manager_id,department_id " +
            " from employess ";
    public static String selectOneEmp = "select * from employees where employee_id = ?";
}
