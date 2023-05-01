public class A30 {

        public static void main(String[] args) {
            int x = 10;
            modifyValue(x);
            System.out.println("After modifyValue(x), x = " + x);

            int[] arr = {10, 20, 30};
            modifyArray(arr);
            System.out.println("After modifyArray(arr), arr[0] = " + arr[0]);
        }

        public static void modifyValue(int x) {
            x = 100;
        }

        public static void modifyArray(int[] arr) {
            arr[0] = 100;
        }
    }


