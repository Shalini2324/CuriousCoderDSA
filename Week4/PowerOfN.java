class Main{
    static int powerofN(int n, int m){
    if(m==0){
        return 1;
    }
    return n * powerofN(n,m-1);
}
    public static void main(String[] args) {
        System.out.println(powerofN(2,3));
    }
}
