package Lab;

public class Majorname {
    /*학과명
    전화번호
    사무실 위치
    학과장*/
    String dept,phone,office,chief;

    public Majorname(){
        dept = "의상디자인";
        phone = "234-5678-9012";
        office = "A동 1층";
        chief = "301";
    }

    public Majorname(String dept, String phone, String office, String chief){
        this.dept = dept;
        this.phone = phone;
        this.office = office;
        this.chief = chief;
    }

}
