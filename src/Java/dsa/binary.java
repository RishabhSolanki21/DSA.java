package Java.dsa;

public class binary {
    public static void main(String[] args) {
        int[]array={1,2,3,6,7,8,9,10,25,69};
        int[]array2={9,8,7,6,5,4,3,2,1};
        System.out.println(search(array,8));

    }
    static int search(int[]arr,int target){
        int s=0;
        int end=arr.length-1;
        boolean asc=arr[s]<arr[end];
        System.out.println(asc);
        while (s<=end) {
            int mid = s + (end - s) / 2;
            if (asc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    s = mid + 1;
                }
            }
            if (!asc) {
                if (arr[mid] > target) {
                    s = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                }
            }
            if (arr[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
