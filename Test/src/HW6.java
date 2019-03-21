import java.util.Arrays;

public class HW6 {

        import java.util.Arrays;;

        public class HWTask2 {
            public int[] getPartOfArray(int[] arr) throws RuntimeException {
                if (arr.length == 0) {
                    throw new NullPointerException ();
                }

                int lastIndexOf4 = -1;
                for (int i = 0; i < arr.length; i++) if (arr[i] == 4) lastIndexOf4 = i + 1;

                if (lastIndexOf4 == -1) throw new RuntimeException ();
                else return Arrays.copyOfRange (arr, lastIndexOf4, arr.length);
            }


        }



    }

/****
 Написать метод, который проверяет что массив состоит только из чисел
 1 и 4. Если в массиве нет хоть одной 4 или 1, то метод вернет false;
 <<<<<<< Updated upstream
 Написать набор тестов для этого метода (варианта 3-4 входных данных)/
 =======
 Написать набор тестов для этого метода (варианта 3-4 входных данных);
 >>>>>>> Stashed changes
 */
public class HWTask3 {
    public static boolean Only1And4(int[] arr) {
        boolean i1 = false, i4 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) i1 = true;
            else if (arr[i] == 4) i4 = true;
            else return false;
        }
        return i1 && i4;
    }
}
