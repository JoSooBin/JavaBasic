package Lab.movies;
//배우들은 이름과 생년월일로 식별되며 한 개 이상의 영화에 출현한다. 각 배우는 영화에서 배역을 맡는다.
public class Actor {
    //멤버변수
    private String name;
    private String birth;
    private String[] joinmovie;
    private String[] csating;

    //생성자
    public Actor(){

    }

    public Actor(String name, String birth, String[] joinmovie, String[] csating) {
        this.name = name;
        this.birth = birth;
        this.joinmovie = joinmovie;
        this.csating = csating;
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

    public String[] getJoinmovie() {
        return joinmovie;
    }

    public void setJoinmovie(String[] joinmovie) {
        this.joinmovie = joinmovie;
    }

    public String[] getCsating() {
        return csating;
    }

    public void setCsating(String[] csating) {
        this.csating = csating;
    }
}
