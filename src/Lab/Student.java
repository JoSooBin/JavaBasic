package Lab;
//학생클래스
/*학번
이름
주소
생년월일 //
학과명
교수 //문자로 작성
*/
class Student { //클래스는 대문자, 변수는 소문자여야 함.
    String name, addr, dept,birth,prof;
    int stdno;

    //기본생성자
   public Student(){
        stdno = 201250006;
        name = "송혜교";
        addr = "서울영등포구";
        dept = "1988.9.17";
        birth = "컴퓨터";
        prof = "301";
    }

    public Student(int stdno, String name, String addr, String dept, String birth,String prof){
        this.stdno = stdno;
        this.name = name;
        this.addr = addr;
        this.dept = dept;
        this.birth = birth;
        this.prof = prof;
    }
}
