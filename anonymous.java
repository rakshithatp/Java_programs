public class anonymous {
    public static void main(String args[]){
        sum(new int[]{1,2,3,4,5});
    }
    public static void sum(int[] x){
        int total=0;
        for (int x1:x){
           total = total+1;

        }
        System.out.println(total);
    }
    
}
