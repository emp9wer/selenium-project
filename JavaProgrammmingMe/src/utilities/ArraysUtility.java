package src.utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;

    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }


    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length];

        int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }
        return arr3;
    }


    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array) {
        double[] reverse = new double[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }

    public static char[] reverse(char[] array) {
        char[] reverse = new char[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--) {
            reverse[j++] = array[i];
        }
        return reverse;
    }

    public static int[] addElements(int[] array, int element) {
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static double[] addElements(double[] array, double element) {
        double[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static char[] addElements(char[] array, char element) {
        char[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static String[] addElements(String[] array, String element) {
        String[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length - 1] = element;
        return new_array;
    }

    public static boolean contains(int[] array, int element) {

        for (int each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] array, double element) {

        for (double each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char element) {

        for (char each : array) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element) {

        for (String each : array) {
            if (each.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public static int[] remove(int[] array, int index) {
        int[] res = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {

            if (index != i) {
                res[j++] = array[i];
            }
        }
        return res;

    }
    public static double[] remove(double[] array, int index) {
        double[] res = new double[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {

            if (index != i) {
                res[j++] = array[i];
            }
        }
        return res;

    }
    public static char[] remove(char[] array, int index) {
        char[] res = new char[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {

            if (index != i) {
                res[j++] = array[i];
            }
        }
        return res;

    }
    public static String[] remove(String[] array, int index) {
        String[] res = new String[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {

            if (index != i) {
                res[j++] = array[i];
            }
        }
        return res;

    }


  public static int[] removeDup(int[] array) {
      
      for (int i = 0; i < array.length; i++) {

          for (int j = array.length - 1; j > i; j--) {

              if(array[i]==array[j]){
                array =  ArraysUtility.remove(array,j);
              }
          }
      }
      return array;
  }

    public static double[] removeDup(double[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = array.length - 1; j > i; j--) {

                if(array[i]==array[j]){
                    array =  ArraysUtility.remove(array,j);
                }
            }
        }
        return array;
    }

    public static char[] removeDup(char[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = array.length - 1; j > i; j--) {

                if(array[i]==array[j]){
                    array =  ArraysUtility.remove(array,j);
                }
            }
        }
        return array;
    }

    public static String[] removeDup(String[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = array.length - 1; j > i; j--) {

                if(array[i].equals(array[j])){
                    array =  ArraysUtility.remove(array,j);
                }
            }
        }
        return array;
    }
  /*  public static int[] removeDup(int[] array) {
        String a= "";
        for (int i = 0; i < array.length; i++) {
            if(!a.contains(array[i]+"")){
                a+=array[i]+ " ";
            }
        }
        int[] res = new int[a.length()/2];
        String[] b = a.split(" ");
        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.valueOf(b[i]);
        }
        return res;
    }
*/





}