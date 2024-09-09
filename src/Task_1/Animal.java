package Task_1;

    public class Animal {

        String name;
        public static int count = 0;
        public Animal(String name) {
            this.name = name;
            count++;
        }

        public static int printCount() {
            return count;
        }

        public void run(int distance) {
            System.out.println(name + " пробежал " + distance + " м.");
        }

        public void swim(int distance) {
            System.out.println(name + " проплыл " + distance + " м.");
        }
    }
