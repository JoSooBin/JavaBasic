package Lab.movies;
//감독들도 이름과 생년월일로 식별되며 한 개 이상의 영화를 감독한다.
// 감독이 영화에 출현하는 것도 가능하다. (그 감독이 감독한 영화에 한해서 말이다)
public class Director {
    //멤버변수
    private String name;
    private String birth;
    private String[] movie;
    private String[] casting;//참여한 영화'들' 이므로 배열

    //생성자
    public Director(){

    }

    public Director(String name, String birth, String[] movie, String[] casting) {
        this.name = name;
        this.birth = birth;
        this.movie = movie;
        this.casting = casting;
    }


    //setter/getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String[] getMovie() {
        return movie;
    }

    public void setMovie(String[] movie) {
        this.movie = movie;
    }

    public String[] getCasting() {
        return casting;
    }

    public void setCasting(String[] casting) {
        this.casting = casting;
    }
}
