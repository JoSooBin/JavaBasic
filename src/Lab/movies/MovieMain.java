package Lab.movies;
//출력 교재 120~168p
public class MovieMain {
    public static void main(String[] args) {
        String[] genre = {"드라마"}; //길어서 그냥 변수선언
        String[] dirtor = {"스콧 프랭크","앨런 스코트"}; //길어서 그냥 변수선언
        String[] actor = {"애니아 테일러조이","토머스 브로디","해리 멜링"}; //길어서 그냥 변수선언
        String summary = "여름날에 일어난 이야기";
        String desc = "감독이 말하는 영화소개 블라블라";

        Movie queenscombat = new Movie("퀸즈컴벳", "2020", 350, "넷플렉스", genre,
                dirtor, actor, summary,desc);

        System.out.println(queenscombat.getTitle());
        System.out.println(queenscombat.getYear());
        System.out.println(queenscombat.getRuntime());
        System.out.println(queenscombat.getPrdtin());
        //참조형 변수이므로 배열의 내용 대신 내용이 저장된 위치가 출력 : 반복문으로 해결
        for(int i=0; i < dirtor.length;i++){
            System.out.println(queenscombat.getDirtor()[i]);
        }

        System.out.println(queenscombat.getGenre()[0]);//배열은 참조형 변수라 주소 나옴. 값을 뽑아내기 위해 [0],[1] 등 or 반복문 써줘야함

        for(int i=0; i < dirtor.length;i++){
            System.out.println(queenscombat.getActor()[i]);
        }
        System.out.println(queenscombat.getSummary());
        System.out.println(queenscombat.getDesc());

    }
}
