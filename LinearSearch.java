class LinearSearch{
    public static int search(int arr[] , int x){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,15,19,25,85,36,45,62};
        int find = 25;  //  index is 3
        int result = search(arr , find );
        if(result == -1)
            System.out.println("Element is Not in Array");
        else
            System.out.println("Element is present at index " + result);
    }
    
}


/*
Notes:
    The time complexity of above algorithm is O(n).

    Linear search is rarely used practically because other search algorithms such as the binary search algorithm and hash tables allow significantly faster searching comparison to Linear search.

*/