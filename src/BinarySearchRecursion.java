public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] sampleData = {2,5,8,12,16,23,38,56,72,91};
//        System.out.println(sampleData.length);
        System.out.println(BinarySearch(sampleData,72,0, sampleData.length-1));
    }

    public static int BinarySearch(int[] arr, int target, int low, int high){
        int mid = low + ((high-low)/2) ;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return BinarySearch(arr, target, low, mid-1);
        }else if(arr[mid]<target){
            return BinarySearch(arr, target, mid+1, high);
        }else{
            return -1;
        }
    }
}
