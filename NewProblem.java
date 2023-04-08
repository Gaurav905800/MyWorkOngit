
public class NewProblem{
    public static void main(String[] args){
       
        int[] a = {1,2,3,4,5};
        int[] b = {5,7,8,9,6};
        int x = 0;
        for(int i = 0;i< a.length;i++){
            for(int j = 0;j<b.length;j++){
                if(a[i] == b[j]){
                    x++;
System.out.println(x);
                }
            }
        }
        }
}
