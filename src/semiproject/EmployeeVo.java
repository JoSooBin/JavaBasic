package semiproject;
/*
*사번 empno
이름 fname
이름2 lname
이메일 email
전화번호 phone
날짜 hdate
아이디 jobid
급여 sal
매니저 아이디 mgrid
부서번호 deptid
* */
public class EmployeeVo {
    private int empno; //사번
    private String fname; //성
    private String email; //이메일
    private String jobid; //직책
    private int mgrid;//매니저 아이디
    private int deptid; //부서번호

    private String lname; //이름
    private String phone; //전화번호
    private String hdate; //날짜
    private int sal;//급여


//생성자
    public EmployeeVo() {
    }

//매개변수


    public EmployeeVo(int empno, String fname, String email, String jobid, int mgrid, int deptid, String lname, String phone, String hdate, int sal) {
        this.empno = empno;
        this.fname = fname;
        this.email = email;
        this.jobid = jobid;
        this.mgrid = mgrid;
        this.deptid = deptid;
        this.lname = lname;
        this.phone = phone;
        this.hdate = hdate;
        this.sal = sal;
    }

    //getter/setter
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getMgrid() {
        return mgrid;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
}
