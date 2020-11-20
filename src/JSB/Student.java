package JSB;
//p175
public class Student {
    public String studentName;
    public int grade;
    public int money;

    //학생 이름과 가진돈을 매개변수로 받는 생성자
    public Student(String studentName, int money){
        this.studentName = studentName;
    }

    //학생이 버스를 타면 1000원 지불 기능 메서드
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }

    //학생의 현재 정보 출력
    public void showInfo(){
        System.out.println(studentName+"님의 남은돈은 "+money+"입니다");
    }
}
