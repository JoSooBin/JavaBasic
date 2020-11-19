package Lab;
/*각 영화는 제목과 개봉연도에 의해 식별된다.
각 영화는 분 단위의 상영시간을 갖는다.
또한, 제작사와 한 개 또는 그 이상의 장르(공포,액션,드라마등)에 의해 분류된다.
각 영화는 한 명 또는 그 이상의 감독이 있고,
한 명 또는 그 이상의 배우가 등장한다.
각 영화는 줄거리도 제공한다.
마지막으로 출현한 영화배우들이 말하는 영화소개가 하나 이상 제공된다*/
public class Q79_Movie {
    public static void main(String[] args) {
        Moive mv = new Moive();
        Actor cho = new Actor();
        Direct jo = new Direct();
        Product fac = new Product();

        //매개변수 초기화
        Moive ju = new Moive("전지현",2020,"경기도의정부시","1986.4.30","의상디자인","445","lk","jkg");
        // 매개변수 출력
        System.out.println(ju.title);
        System.out.println(ju.year);
        System.out.println(ju.runtime);
        System.out.println(ju.genre);
        System.out.println(ju.direct);
        System.out.println(ju.actor);
        System.out.println(ju.outline);
        System.out.println(ju.movieitro);
    }
}

//영화
class Moive{
    String title;
    int year;
    String runtime;
    String genre;
    String direct;
    String actor;
    String outline;
    String movieitro;

    //매개변수 생성자
    public Moive(String title, int year, String runtime, String genre, String direct, String actor, String outline, String movieitro) {
        this.title = title;
        this.year = year;
        this.runtime = runtime;
        this.genre = genre;
        this.direct = direct;
        this.actor = actor;
        this.outline = outline;
        this.movieitro = movieitro;
    }

    public Moive() {

    }
}

//배우
class Actor{
    String naem;
    String birth;
    String movie;
    String csat;

    //매개변수 생성자
    public Actor(String naem, String birth, String movie, String csat) {
        this.naem = naem;
        this.birth = birth;
        this.movie = movie;
        this.csat = csat;
    }
    //기본생성자
    public Actor() {

    }
}


//감독
class Direct{
    String naem;
    String birth;
    String movie;
    private String csat;

    //매개변수 생성자
    public Direct(String naem, String birth, String movie, String csat) {
        this.naem = naem;
        this.birth = birth;
        this.movie = movie;
        this.csat = csat;
    }
    //기본생성자
    public Direct() {

    }
}

//제작사
class Product{
    String naem;
    String addr;
    String movie;

    //매개변수 생성자
    public Product(String naem, String addr, String movie) {
        this.naem = naem;
        this.addr = addr;
        this.movie = movie;
    }

    //기본생성자
    public Product() {

    }
}