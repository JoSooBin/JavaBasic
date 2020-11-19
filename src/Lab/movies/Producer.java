package Lab.movies;
//제작사는 이름으로 식별되며 주소를 갖는다. 제작사는 한 개 이상의 영화를 제작한다
public class Producer {

    private String name;
    private String addr;
    private String[] movie;

    public Producer(String name, String addr, String[] movie) {
        this.name = name;
        this.addr = addr;
        this.movie = movie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String[] getMovie() {
        return movie;
    }

    public void setMovie(String[] movie) {
        this.movie = movie;
    }
}
