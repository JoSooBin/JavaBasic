package JSB;

import java.util.*;

public class AdvCollection {
    public static void main(String[] args) {
        //Set : 집합
        //Set 인터페이스를 구현한 컬렉션 클래스
        //요소의 저장순서가 유지안됨
        //데이터를 중복으로 저장불가
        //HashSet : 해쉬 알고리즘을 이용해서 데이터를 저장하기 때문에 검색 속도가 빠름
        //일반적으로 저장된 자료의 양에 상관없이 특정 데이터를 찾는데 걸리는 시간이 항상 일정할 순 없을까?
        //-> 해쉬 알고리즘을 이용해서 실현

        Set<String> names = new HashSet<>();

        //데이터 추가 : add
        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add("지현"); //중복데이터 추가

        //데이터 모두 출력
        /*for(int i = 0; i<names.size(); i++){
            System.out.println(names.get(i));//get 사용불가
            }*/
        for (String name : names) {
            System.out.println(name);
        }//2번 입력한 데이터가 하나만 출력
        System.out.println("-------------------");

        //컬렉션 요소 순회iterate하기
        //컬렉션 프레임워크에 저장된 각 요소들을 읽어오는 방법을 표준화한 것

        Iterator<String> iter = names.iterator();
        //Iterator는 OOP프로그래밍에서 배열이나 그와 유사한 자료구조의 내부 요소를 순회하는 객체를 의미
        while (iter.hasNext()) { //읽어올 데이터를 가리킬 수 있도록 포인터를 옆으로 옮겨서 데이터를 가져오는
            System.out.println(iter.next());
        }

        //데이터 수정 : set (사용불가)
        //names.set(0,"수현");
        //따라서, 먼저 remove한 후 add로 처리
        //혜교를 수현으로 바꾸는 경우
        names.remove("혜교");
        names.add("수현");

        //hastest에 다양한 유형의 값을 추가
        names.add("4654");
        names.add("태희");
        names.add("4556465");

        iter = names.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }//값들이 특이한 순서로 출력됨
        //=>각 데이터의 고유 해쉬값에 의해 정렬되어 출력
        System.out.println("-------------------");

        //https://url.kr/IJ7jdR
        //sha256 hash코드 생성기
        //sha(secure hash algorithm)
        //256 : 256bit 길이의 코드생성성(정렬은 고유 해쉬값에 의해 정렬)

        //HashMap
        //키와 값으로 저장하는 컬렉션클래스
        //Map인터페이스를 구현한 컬렉션 클래스
        //키와 값을 하나의 쌍으로 저장하는 방식을 사용
        //키는 실질적으로 값을 찾기 위한 방편으로 사용
        //요소의 저장순서는 유지되지 않음
        //키는 중복데이터를 저장 할 수 없음
        //단, 값은 중복으로 저장 할 수 있음
        //해시 알고리즘을 사용하기 때문에 검색속도가 매우 빠름

        //데이터 추가 : put (키, 값)
        //게임 이름과 가격을 저장하는 해시맵을 생성
        Map<String, Integer> product = new HashMap<>(); //<키의 유형, 값의 유형>

        product.put("디아블로" ,3000);
        product.put("스타크래프트" ,45000);
        product.put("워크래프트" ,25000);

        //값 조회 : get (키를 찾아 값을 출력)
        System.out.println(product.get("스타크래프트"));
        System.out.println("-------------------");

        //모든 키 확인 : keySet
        //keySet의 리턴값은
        Set<String> keys = product.keySet();

        for( String key : keys) {
            System.out.println(key);
        }
        System.out.println("-------------------");

        //모든 값 확인 : values
        //values 메서드의 리턴값
        Collection<Integer> vals = product.values();
        for(Integer val : vals) {
            System.out.println(val);
        }
        System.out.println("-------------------");

        Map<Integer, GameInfo> games = new HashMap<>();
        games.put(123, new GameInfo("스타크래프트",35000));
        games.put(234, new GameInfo("워크래프트",25000));
        games.put(345, new GameInfo("디아블로",45000));


        //key가 234인 게임의 정보 출력
        System.out.println( games.get(234).name );
        System.out.println( games.get(234).price );
        //GameInfo의 모든 게임정보 출력
        Set<Integer> keys2 = games.keySet();
        for(Integer key : keys2){
            System.out.println( );
            System.out.println("키가"+key+"인 게임정보");
            System.out.println( games.get(key).name );
            System.out.println( games.get(key).price );
        }
        System.out.println("-------------------");

    }
}
