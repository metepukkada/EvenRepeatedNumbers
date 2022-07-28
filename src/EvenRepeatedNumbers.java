import java.util.Arrays;

public class EvenRepeatedNumbers {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 9, 6, 2, 7, 5, 6, 5, 7, 9, 8, 8, 8, 10 ,92 , 44 , 44 ,67 , 88 ,88 ,88};
        Arrays.sort(array);
        System.out.println("Girilen Dizi: " + Arrays.toString(array));
        int[] duplicate1 = new int[array.length];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        int[] fixedArray = new int[count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                fixedArray[j] = array[i];
                j++;
            }
        }
        int startIndex = 0;
        int count1 = 0;
        for (int i = 0; i < fixedArray.length; i++) {
            for (int j = 0; j < fixedArray.length; j++) {
                if (i != j && fixedArray[i] == fixedArray[j]) {
                    if (!isFind(duplicate1, fixedArray[i])) {
                        duplicate1[startIndex++] = fixedArray[i];
                        count1++;
                    }
                }
            }
        }
        int[] finalArray = new int[count1];
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = duplicate1[i];

        }
        System.out.println(Arrays.toString(finalArray));
    }
}









