public class VarArgs {
    
    public static int sum(String str ,int... s){
        int sum = 0;
        for(int i:s){
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args) {

        // VarArgs v = new VarArgs();
        int a = sum(null, 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println(a);
        
        int s = sum("Omama Bashir",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println(s);
    }
}
