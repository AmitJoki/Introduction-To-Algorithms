class Insertionsort{
    void insertsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

     public static void main(String[] args) {
         int arr[]={5,4,3,2,1};
        new Insertionsort().insertsort(arr);    
    }

    
}