class Search{
    public static int Binary(int arr[],int T)
    {
        int left=0;
        int right=arr.length-1;
        int mid;
        while(left<=right)
        {
            mid =(left+right)/2;
            if(arr[mid]==T)
            {
                return mid;
            }
            else if(arr[mid]>T)
            {
                right=mid-1;
            }
            else if(arr[mid]<T)
            {
                left=mid+1;
            }
        }
        return -1;

    }
}
public class binary{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80};
        int Target=20;
        int res=Search.Binary(arr,Target);
        System.out.print(res+" "+arr[res]);

    }
}