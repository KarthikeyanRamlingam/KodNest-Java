
class find{
    int count=0;
    void count(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                count++;

            }
        }
        System.out.println(key+":"+count);
    }
}
public class freq{
    public static void main(String[] args) {
        int arr[]={10,20,10,30,10,30};
        find f=new find();
        f.count(arr,30);
    }
}