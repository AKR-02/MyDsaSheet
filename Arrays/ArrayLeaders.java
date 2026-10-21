package Arrays;

import java.util.ArrayList;

    public class ArrayLeaders {
        static ArrayList<Integer> leaders(int arr[]) {
            // code here
            
            ArrayList<Integer> list = new ArrayList<>();
            int p = arr.length - 1;
            int ele = arr[p];
            while(p>=0){
                if(ele<=arr[p]){
                    ele = arr[p];
                    list.add(0,arr[p]);
                }
                p--;
            }
            return list;
        }
}
