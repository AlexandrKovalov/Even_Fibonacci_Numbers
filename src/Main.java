import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>(ArrayListUtils.listInit(4000000));
        System.out.println(arrayList);
        System.out.println(ArrayListUtils.sumOfEvenNumbers(arrayList));
    }
}