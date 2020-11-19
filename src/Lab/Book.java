package Lab;

public class Book {
    //멤버변수 선언
    String name, writer, pubname, pubdate, bkimg;
    int price;
    double discount;

    //기본생성자
    public Book() {

    }

    //매개변수 생성자 //art + insert키 눌러서 전체 선택하고 ok누르면 자동 생성성
    public Book(String name, String writer, String pubname, String pubdate, String bkimg, int price, double discount) {
        this.name = name;
        this.writer = writer;
        this.pubname = pubname;
        this.pubdate = pubdate;
        this.bkimg = bkimg;
        this.price = price;
        this.discount = discount;
    }
}
