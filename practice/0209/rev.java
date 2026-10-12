class rev{
    public static void main(String []args)
    {
        int[] arr={10,20,30,40,50};
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            right--;
            left++;
        }
        int i=0;
        while(i<arr.length)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}