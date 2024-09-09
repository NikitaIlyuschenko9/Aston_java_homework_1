package Task_1;

// проверяем ВСЁ
public class Main {
    public static void main(String[] args) {
        Food foodPlate = new Food(); // начальное количество еды задано в классе
        foodPlate.addFood(30); // тут можно добавить вкусняшек

        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(160);
        catBarsik.run(240);
        catBarsik.swim(11);
        System.out.println();

        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(490);
        dogBobik.run(510);
        dogBobik.swim(9);
        dogBobik.swim(12);
        System.out.println();

        Cat[] bunchOfCats = new Cat[5];
        bunchOfCats[0] = new Cat("Барсик");
        bunchOfCats[1] = new Cat("Масик");
        bunchOfCats[2] = new Cat("Барс");
        bunchOfCats[3] = new Cat("Антон");
        bunchOfCats[4] = new Cat("Котофей");

        for (Cat i : bunchOfCats) {
            System.out.println("В миске было - " + foodPlate.food + " еды");
            if (foodPlate.food >= i.needFood) {
                foodPlate.food -= i.needFood;
                i.satiety = true;
            }
            System.out.println(i.satiety ? i.name +
                    " сыт" :
                    i.name + " голоден");
            System.out.println( i.name + " надо было " +
                    i.needFood + " еды."); // вывод на печать для проверки, сколько еды требовалось
            System.out.println("В миске осталось " +
                    foodPlate.food + " еды.");
            System.out.println();
        }
        System.out.println("Всего создано животных - " + Animal.printCount() + "\nСоздано котов - " + Cat.countCat() + "\nСоздано собак - " + Dog.printCountDog());
    }
}
