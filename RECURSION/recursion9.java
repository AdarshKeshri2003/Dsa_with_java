public class recursion9 {
    //FROG PROBLEM
    static int bestjump(int[] h, int n, int index){
        if(index == n-1) return 0;
        int op1 = Math.abs(h[index] - h[index+1]) + bestjump(h,n, index+1);
        if(index == n-2) return op1;
        int op2 = Math.abs(h[index] - h[index+2]) + bestjump(h,n, index+2);
        return Math.min(op1, op2);
    }
    public static void main(String[] args) {
        int[] h = {10,30,40,20};
        System.out.println("Minimum cost is "+ bestjump(h,h.length,0));
    }
    
}