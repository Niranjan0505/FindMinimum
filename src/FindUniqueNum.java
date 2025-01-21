public class FindUniqueNum {
    public static void main(String[] args) {
        int arr[]={2,2,3,2,4,6,3,3,3};
        int n=9;
        for (int i=0; i<n; i++)
        {
            int cnt=0;
            for(int j=0; j<n; j++){
                if(arr[j]==arr[i]) cnt++;
            }
            if(cnt==1)
                System.out.println(arr[i]);
        }


    }
}
