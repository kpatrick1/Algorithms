package fiboWord;

public class Main {
    //static int n1=0,n2=1,n3=0;
    static String s0="0",s1="01",s3="0";

    public static void main(String[] args) {
        String s = new String();
        int count=5;
        System.out.print(s1+""+s0);
        printFibo(count-2);
    }
    static void printFibo(int count){
        int i = 0;
        if(count>0){
            s3 = s1 + s0;
            s0 = s1;
            s1 = s3;
            System.out.print(""+s0);
            printFibo(count-1);
        }
    }

}
