package SearchingProgram;

public class BinarySearch {
    int binarySearch(int arr[],int lower,int upper,int search){
        if (upper>=lower){
            int mid =lower + (upper-1) / 2;
            if (arr[mid] == search){
                return mid;
            }
            if (arr[mid]<search){
                //lower = mid+1
                return binarySearch(arr,mid+1,upper,search);
            }
            else {
                //upper = mid-1
                return binarySearch(arr,lower,mid-1,search);
            }
        }
       return -1;
    }
    public static void main(String[] args){
        int[] arr = {2,3,5,8,9,10};
        BinarySearch binarySearch = new BinarySearch();
        int n = arr.length;
        int result = binarySearch.binarySearch(arr,0,n-1,4);
        if (result == -1){
            System.out.println("Element "+ "Not Found");
        }
        else {
            System.out.println("Search Element is Found" + " at index " +result);
        }
    }
}
