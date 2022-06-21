import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

//сортировка выбором
public class homework4 {

    public static void main(String[] arg) {
        int[] arraySortSelect = new int[100];
        for (int i = 0; i < arraySortSelect.length; i++) {
            arraySortSelect[i] = ((int) (Math.random() * 33 - 10));
        }
        ArrayList<Integer> arrayCollectionsSort = (ArrayList<Integer>) Arrays.stream(arraySortSelect).boxed().collect(Collectors.toList());

        System.out.println(Arrays.toString(arraySortSelect));
        int lengthArray = arraySortSelect.length;
        long start = System.nanoTime();
        for (int i = 0; i < lengthArray; i++) {
            int position = i;
            int min = arraySortSelect[i];
            for (int j = i + 1; j < lengthArray; j++) {
                if (arraySortSelect[j] < arraySortSelect[position]) {
                    position = j;
                    min = arraySortSelect[j];
                }
            }
            arraySortSelect[position] = arraySortSelect[i];
            arraySortSelect[i] = min;
        }
        long end = System.nanoTime();
        System.out.println(end - start + " нс затрачено на сортировку выбором");
        System.out.println(Arrays.toString(arraySortSelect) + "\n --------------------------------");

        System.out.println(Arrays.toString(new ArrayList[]{arrayCollectionsSort}));
        long startTime = System.nanoTime();
        Collections.sort(arrayCollectionsSort);
        long endTime = System.nanoTime();
        long finishTime = startTime - endTime;
        System.out.println(finishTime + " нс затрачено на встроенную сортировку Java");
        System.out.println(Arrays.toString(new ArrayList[]{arrayCollectionsSort}));
    }

}