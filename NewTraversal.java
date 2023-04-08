
class Traversal1{
    void NextTraversal(){
       int b [] = new int[3];
       b[0] = 10;
       b[1] = 20;
       b[2] = 30;
        for(int i= 0;i<b.length;i++){
            System.out.print(+b[i]+" ");
        }
    }
    void traversal2(){
     int a[] = {10,20,30,40};

     for(int i = 0;i<a.length;i++){
        System.out.print(+a[i]+" ");
     }
            }
     void traversal3(){
        int a[] = {10,20,30,40};
        for(int c : a){
            System.out.print(c+" ");
        }
     }       
}
public class NewTraversal {
    public static void main(String[] args) {
        // NewTraversal n = new NewTraversal();
        Traversal1 c = new Traversal1();
        c.NextTraversal();
        System.out.println();
        c.traversal2();
        System.out.println();
        c.traversal3();
    }
}
