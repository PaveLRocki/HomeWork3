package pet;

import java.util.Arrays;
import java.util.Random;

public class Launch {
    public static void main(String[] args) {
        Launch.cycleWhile();
        Launch.cycleFor();
        Launch.cycleDoWhile();
        Launch.cycleForEach();
    }
    private static char randomChar(){
        Random randomSym = new Random();
        char sym = (char) (randomSym.nextInt( 33) + 'А');
        return sym;
    }
    private static int randomLenght(){
        Random Lenght = new Random();
        int lenght = Lenght.nextInt(7, 12);
        return lenght;
    }
    private static String randomName(){
        char[] catName = new char[randomLenght()];
        for (int i = 1; i < catName.length; i++){
            catName[i] = randomChar();
        }
        String name = String.copyValueOf(catName);
        return  name;
    }
    private static int randomAge(){
        Random num = new Random();
        int age = num.nextInt(28);
        return age;
    }
    public static void cycleFor(){
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setName(randomName());
            cat.setAge(randomAge());
            System.out.println("КотЭ - " + cat.getName() + ", возрастом - " + cat.getAge());
        }
        System.out.println();
    }
    public static void cycleDoWhile(){
        int i = 0;
        do {
            Cat cat = new Cat(randomName(), randomAge());
            System.out.println(cat);
            i++;
        } while (i < 10);
        System.out.println();
    }
    public static void cycleWhile(){
        int i = 1;
        while (i < 10){
            Cat cat = new Cat();
            i++;
            System.out.println(cat);
        }
        System.out.println();
    }
    public static void cycleForEach(){
        Cat[] cats = new Cat[5];
        for (int i = 0; i < cats.length; i++){
            Cat cat = new Cat(randomName(), randomAge());
            cats[i] = cat;
        }
        for (Cat cat : cats){
            System.out.println(cat);
        }
    }

}
