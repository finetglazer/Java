package abstractClass;


abstract class Animal {
    public abstract void speak();// phuong thuc truu tuong
    public abstract void eat();
}

class Meo extends Animal {
    @Override
    public void speak() {// do not use abstract
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Meo an ca");
    }
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Gau gau");
    }

    @Override
    public void eat() {
        System.out.println("Dog an xuong");
    }
}
public class Main {
    public static void main(String[] args) {
       // Animal animal = new Animal();
        // abstract class does not let use create an object



        Animal meo = new Meo();
        meo.speak();
        meo.eat();

        Animal dog = new Dog();
        dog.speak();
        dog.eat();

        //abstract class nhuw la 1 hop dong dat ra nhung yeu cau ma cac lop ke thua phai thuc hien
        //-> loi ich khoi phai lap di lap lai nhung phuong thuc

        // how different between abstract class and interface

        dongVat bird = new bird();
        bird.speak();
        bird.eat();
    }

}

interface dongVat {
    void speak();
    void eat();
}

class bird implements dongVat {// implement : trien khai ,extends: loi rong abstract

    @Override
    public void speak() {
        System.out.println("chirp chirp");
    }

    @Override
    public void eat() {
        System.out.println("bird eat worm");
    }
}

//abstract class vs interface
//-> tat ca phuong thuc trong interface deu la abstract
//recall that abstract class can have abstract method and non-abstract method
