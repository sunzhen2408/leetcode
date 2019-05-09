//import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
//
//public class duisort {
////    堆排序核心
////    01 堆的构建
////    02 堆输出根结点，然后互换第一个和最后一个，执行 01
//    static final int SIZE = 10;
//    static void heapsort(int a[],int n){
//        for(int i = n/2-1;i>=0;i--){
//            while(2*i+1<n){
//                int j = 2*i+1;
//                if((j+1)<n){
//                    if(a[j]<a[j+1]){
//                        j++;
//                    }
//                }
//                if(a[i]<a[j]){
//                    int t = a[i];
//                    a[i] = a[j];
//                    a[j] = t;
//                    i=j;
//                }else{
//                    break;
//                }
//            }
//        }
//        System.out.println("dui");
//        for(int i = 0;i<n;i++){
//            System.out.println(" "+a[i]);
////        }
//    }
//public  static  void main(String[] args){
//        int[] s= {}
//}
//}
