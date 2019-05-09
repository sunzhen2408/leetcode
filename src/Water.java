import java.util.ArrayList;

public class Water
{
    public static  void main(String[] args) {
      int[] height = {1,8,6,2,5,4,8,3,7};
      int min = maxArea(height);
        System.out.println(min);
    }
//    public static int maxArea ( int[] height){
//        //i定位一根线，j定位另一根线
//        int k = 0;
//        int[] array = new int[1000];
//        for (int i = 0; i < height.length-1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int temp_min = 0;
//                if (height[i] > height[j]) {
//                    temp_min = height[j];
//                } else {
//                    temp_min = height[i];
//                }
//
//                array[k++] = (j - i) * temp_min;
//            }
//        }
//        int min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > min) {
//                min = array[i];
//            }
//        }
////        System.out.println(array[]);
//        return min;
//    }

    public static int maxArea ( int[] height) {

        //i定位一根线，j定位另一根线
        int k = 0;
        // int[] array = new int[];
        ArrayList list = new ArrayList();
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int temp_min = 0;
                if (height[i] > height[j]) {
                    temp_min = height[j];
                } else {
                    temp_min = height[i];
                }
                int temp_ad = (j - i) * temp_min;
                list.add(temp_ad);
            }
        }
        //System.out.println(list);

        int max = (int) list.get(0);
        for(int i = 0;i<list.size();i++){
            if((int)list.get(i)>max){
                max = (int)list.get(i);
            }
        }
        return max;
    }
}



//
//class Solution {
//    public int maxArea ( int[] height) {
//
//        //i定位一根线，j定位另一根线
//        int k = 0;
//        // int[] array = new int[];
//
//        //ArrayList list = new ArrayList();
//        int max = 0;
//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int temp_min = 0;
//                if (height[i] > height[j]) {
//                    temp_min = height[j];
//                } else {
//                    temp_min = height[i];
//                }
//                int temp_ad = (j - i) * temp_min;
//                //list.add(temp_ad);
//                if(temp_ad>max){
//                    max = temp_ad;
//                }
//            }
//        }
//        //System.out.println(list);
//
//        // int max = (int) list.get(0);
//        // for(int i = 0;i<list.size();i++){
//        //     if((int)list.get(i)>max){
//        //         max = (int)list.get(i);
//        //     }
//        // }
//        return max;
//    }
//}