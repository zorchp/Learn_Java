public class TestEdible {
    public static void main(String[] args) {
        Object[] objs = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < objs.length; ++i) {
            if (objs[i] instanceof Edible)
                System.out.println(((Edible) objs[i]).howToEat());

            if (objs[i] instanceof Animal)
                System.out.println(((Animal) objs[i]).sound());
        }
        // Tiger: RROOAARR
        // Chicken: Fry it
        // Chicken: cock-a-doodle-doo
        // Apple : Make apple cider
    }
}

public interface Edible { // 定义接口
    // public abstract String howToEat(); // 接口的方法
    String howToEat(); // 接口的方法
    // 抽象类需要重写此方法
}

abstract class Animal {
    private double weight;

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: RROOAARR";
    }
}

abstract class Fruit implements Edible {
    // Data FIelds, ctor, and methods ommited here
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple : Make apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}
