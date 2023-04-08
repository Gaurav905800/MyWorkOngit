public class problemAray {
    public static void main (String[] args){
 
        int arr[] = {10,30,40,20,50};
        int x = 20;
         int count = 1;
        for(int i=0;i<arr.length;i++){
            if (arr[i] == x){
            count++;
            }        
        }
        System.out.println(count);
    }
}