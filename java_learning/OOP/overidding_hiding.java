public class overidding_hiding {

    public static class Mammal {

        public String sayHello() {
            return "ohlllalalalalalaoaoaoa";
        }
    }
    
    public static class Cat extends Mammal {
    
        @Override
        public String sayHello() {
            return "meow";
        }
    }
    
    public static class Human extends Mammal {
    
        @Override
        public String sayHello() {
            return "hello";
        }
    }
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        System.out.println(mammal.sayHello()); // it prints "ohlllalalalalalaoaoaoa"

        Cat cat = new Cat();
        System.out.println(cat.sayHello()); // it prints "meow"

        Human human = new Human();
        System.out.println(human.sayHello()); // it prints "hello"
    }
}