import javax.sound.midi.SysexMessage;

public class DSABookPrograms {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = a.clone();
        a[4]=550;
        System.out.println(b[4]);
        isMultiple(7,2);
    }

    public static void isMultiple(long n, long m){
        if(n%m==0){
            System.out.println("Yes, it is a multiple");
        }else{
            System.out.println("Not, it is not a multiple");
        }
    }
}
