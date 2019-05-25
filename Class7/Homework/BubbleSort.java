class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    void printArray(int arr[])
   {
       int n = arr.length;
       for (int i=0; i<n; ++i)
           System.out.print(arr[i] + " ");
       System.out.println();
   }
   public static void main(String args[])
   {
       BubbleSort x = new BubbleSort();
       int arr[] = {64, 34, 25, 12, 22, 11, 90};
       x.bubbleSort(arr);
       x.printArray(arr);
   }

    public static void insertionSort(int array[]) {
       int n = array.length;
       for (int j = 1; j < n; j++) {
           int key = array[j];
           int i = j-1;
           while ( (i > -1) && ( array [i] > key ) ) {
               array [i+1] = array [i];
               i--;
           }
           array[i+1] = key;
       }
   }

   public static void main(String a[]){
       int[] arr1 = {16,14,9,13,15,11,12,10};
       for(int i:arr1){
       }
       insertionSort(arr1);
       for(int i:arr1){
       }
   }


   void selectionSort(int arr[], int n)
{
    int i, j, min_idx;
    for (i = 0; i < n-1; i++)
    {
        min_idx = i;
        for (j = i+1; j < n; j++)
        if (arr[j] < arr[min_idx])
            min_idx = j;
        swap(&arr[min_idx], &arr[i]);
    }
}
]
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;
}
int main()
{
    int arr[] = {14, 10, 12, 13, 11};
    int n = sizeof(arr)/sizeof(arr[0]);
    selectionSort(arr, n);
    printArray(arr, n);
    return 0;
}
