package JSB;

//메서드 재정의 override
//객체지향 중요 3대 개념 중 다형성에 해당
//상속관계에 있는 상위 클래스의 메서드를
//하위클래스에서 같은 이름의 메서드로 다시 작성하는 것을 의미
//즉, 상속받은 메서드를 새로 정의해서 사용하는것을 말함
public class Overriding {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.cry());

        Dog dog = new Dog();
        System.out.println(dog.cry());
    }
}

class Animal{
    protected String cry(){ return  "동물이 웁니다";} //상속관계일때 protected 사용
}

class Cat extends Animal {
    @Override
    protected String cry() { return "야옹야옹"; }
}

class Dog extends Animal{
    @Override
    protected String cry() { return "멍멍";}
}