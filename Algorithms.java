import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int two_digit = two_digit();
        int greather500 = greather500();
        int biggest_num = biggest_num();
        int smallest_num = smallest_num();
        int sum = sum();
        int mode = mode();
        System.out.println(odds);
        System.out.println(evens);
        System.out.println(two_digit);
        System.out.println(greather500);
        System.out.println(biggest_num);
        System.out.println(smallest_num);
        System.out.println(sum);
        double nums = odds + evens;
        System.out.println(sum / nums);
        System.out.println(mode);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int two_digit() throws FileNotFoundException{
        s = new Scanner(f);
        int two_digit = 0;
        while (s.hasNext()) {
            if ((s.nextInt() > 9) && (s.nextInt() < 100))
                two_digit++;
        }
        return two_digit;
    }

    public static int greather500() throws FileNotFoundException{
        s = new Scanner(f);
        int greather500 = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
            greather500++;
        }
        return greather500;
    }

    public static int biggest_num() throws FileNotFoundException{
        s = new Scanner(f);
        int biggest_num = 0;
        while (s.hasNext()) {
            if (s.nextInt() > biggest_num)
                biggest_num = s.nextInt();
        }
        return biggest_num;
    }

    public static int smallest_num() throws FileNotFoundException{
        s = new Scanner(f);
        int smallest_num = 0;
        while (s.hasNext()) {
            if (s.nextInt() < smallest_num)
                smallest_num = s.nextInt();
        }
        return smallest_num;
    }

    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            sum = sum + s.nextInt();
        }
        return sum;
    }

    public static int mode() throws FileNotFoundException{
        s = new Scanner(f);
        int new_count = 0;
        int count = 0;
        int mode = 0;
        for (int i=0; i<1000; i++) {
            new_count = 0;
            while (s.hasNext()) {
                if (s.nextInt() == i) 
                    new_count++;
                    if (count < new_count) mode = i;
            }
        }
        return mode;
    }
}