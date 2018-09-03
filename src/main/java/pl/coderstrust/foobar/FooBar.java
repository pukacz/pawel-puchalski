package pl.coderstrust.foobar;

public class FooBar {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 100) {
            String text = "" + i;

            if ((i % 3) == 0) {
                text = i + " Foo";
            }

            if ((i % 5) == 0) {
                text = i + " Bar";
            }

            if ((i % 15) == 0) {
                text = i + " FooBar";
            }

            System.out.println(text);

            i++;
        }

    }
}
