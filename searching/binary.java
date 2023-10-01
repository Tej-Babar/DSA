public class binary {
    public static void main(String[] args) {
        int[] arr={-1,1,3,5,7,12,45,345,789,999,1234,7654};
        int[] arr2={99,88,66,55,44,33,22,11,10,-1,-11,-14};
        int target=-14;
        System.out.println(Binary(arr2, target));
        System.out.println(RBinary(arr,7, 0, arr2.length-1));
        
    }

    static int Binary(int[] arr,int target){
     
        int s,m,e;
        s=0;
        e=arr.length-1;
        
        while(s<=e){
        m=(s+e)/2;
        if (arr[m]==target) {
         
            return m;

        }
        else if (arr[s]<arr[e]) {
            if (arr[m]<target) {
                s=m+1;
                
            } else {
                e=m-1;
                  
            }
        }
        else{
            if (arr[m]>target) {
                s=m+1;
                
            } else {
                e=m-1;
                  
            }
        }
    }
   return -1;
    }

    static int RBinary(int[] arr,int target,int s,int e){

        if(s>e){
            return -1;
        }

        int m=(s+e)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[m]>target){
           return RBinary(arr, target, s, m-1);
        }
        return RBinary(arr, target, m+1, e);

    }
}
