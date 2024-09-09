package Task_1;

public class Dog extends Animal {
    public static int countDog = 0;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    public static int printCountDog() {
        return countDog;
    }

    @Override
    public void run(int distance) {
        System.out.println(distance <= 500 ? name +
                " пробежал(а) " + distance + " м." :
                name + " не может пробежать больше 500м.");
    }

    @Override
    public void swim(int distance) {
        System.out.println(distance <= 10 ? name + "проплыл(а) " + distance + " м." :
                name + " не может проплыть больше 10м.");
    }
}
