package Lab.movies;
/*각 영화는 제목과 개봉연도에 의해 식별된다.
각 영화는 분 단위의 상영시간을 갖는다.
또한, 제작사와 한 개 또는 그 이상의 장르(공포,액션,드라마등)에 의해 분류된다.
각 영화는 한 명 또는 그 이상의 감독이 있고,
한 명 또는 그 이상의 배우가 등장한다.
각 영화는 줄거리도 제공한다.
마지막으로 출현한 영화배우들이 말하는 영화소개가 하나 이상 제공된다*/

public class Movie {
    //멤버변수
    private String title;
    private String year;
    private int runtime;
    private String prdtin;
    private String[] genre;
    private String[] dirtor;
    private String[] actor;
    private String summary;
    private String desc;

    //생성자
    public Movie() {

    }
    //
    public Movie(String title, String year, int runtime, String prdtin, String[] genre,
                 String[] dirtor, String[] actor, String summary, String desc) {
        this.title = title;
        this.year = year;
        this.runtime = runtime;
        this.prdtin = prdtin;
        this.genre = genre;
        this.dirtor = dirtor;
        this.actor = actor;
        this.summary = summary;
        this.desc = desc;
    }

    //setter/getter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getPrdtin() {
        return prdtin;
    }

    public void setPrdtin(String prdtin) {
        this.prdtin = prdtin;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public String[] getDirtor() {
        return dirtor;
    }

    public void setDirtor(String[] dirtor) {
        this.dirtor = dirtor;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
