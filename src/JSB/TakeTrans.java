package JSB;
//p179
public class TakeTrans {
    public static void main(String[] args) {
        Student studentJo = new Student("df",5000); //학생 생성

        Bus bus100 =new Bus(100); //노선번호 100
        studentJo.takeBus(bus100); //JO가 100번 버스 탑승
        studentJo.showInfo(); //돈 내고 jo정보 출력
        bus100.showInfo(); //100번 버스 정보 출력
    }
}
