package BaekjoonOnlineJudge.StepByStep.Function;

public class SelfNumber_4673 {
    public static void main(String[] args) {
        for(int i=1; i<=10000; i++){
            int n = i;
            if(n>10){
                System.out.println(n + n/10 + n%10);
            }
            System.out.println(n + n);
        }
    }
    private static int getDn(int n){
        int dn = n;
        while(n>0){
            dn += n%10;
            n /= 10;
        }
        return dn;
    }
}