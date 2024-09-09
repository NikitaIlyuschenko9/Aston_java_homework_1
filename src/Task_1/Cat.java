package Task_1;

public class Cat extends Animal {
    public boolean satiety;
    public int needFood;
    public static int countCat = 0;

    public Cat(String name) {
        super(name);
        this.satiety = false;
        this.needFood = (int) (Math.random()  + 15); //* ((20 - 15) + 1))
        countCat++;
    }

    public static int countCat() {
        return countCat;
    }

    // учим бегать
    @Override
    public void run(int distance) {
        System.out.println(distance <= 200 ?  name + " пробежал(а) " + distance + " м." :
                name + " не может пробежать больше");
    }

    // учим плавать
    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}
