package ProblemasHackerRank;
import java.text.DecimalFormat;
public class arrayPrecision {
    public static void main(String[] args) {
        int[] arr = new int[5];

        int p = 0;
        int n = 0;
        int c = 0;
        double pRatio = 0;
        double nRatio = 0;
        double cRatio = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                p=p+1;
            }else if(arr[i]==0){
                c=c+1;
            }else{
                n=n+1;
                }
            }
        pRatio =(double) p/arr.length;
        nRatio =(double) n/arr.length;
        cRatio =(double) c/arr.length;
        System.out.println(pRatio);
        System.out.println(nRatio);
        System.out.println(cRatio);        
    }
}
