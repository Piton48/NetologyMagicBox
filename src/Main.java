public class Main {
    public static void main(String[] args) {
        MagicBox<String> str = new MagicBox<>(3);
        MagicBox<Integer> num = new MagicBox<>(10);

        str.add("Vanya");
        str.add("Olya");
        //str.add("Petya");

        for (int i = 0; i < 20; i++){
            num.add(i);
        }

        System.out.println(num.pick());
        System.out.println(str.pick());
    }
}