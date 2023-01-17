import java.util.ArrayList;
public class ArrayListUtils {
    public static ArrayList <Integer> list = new ArrayList<>();
    public static int result = 0;
    public static int result2 = 0;
    public static int count = 2;
        public static ArrayList <Integer> listInit (int finalNumber) {

            list.add(1);
            list.add(2);
            while (result <= finalNumber) {
                    result = list.get(count - 1) + list.get(count - 2);
                    list.add(result);
                    count++;
                if ( result > finalNumber) {
                    list.remove(list.size() - 1);
                }
            }
            return list;
}
        public static int sumOfEvenNumbers (ArrayList <Integer> list2) {
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i)% 2 == 0) {
                    result2 = result2 + list2.get(i);
                } else {
                    result2 = result2 + 0;
                }
            } return result2;
        }
}
