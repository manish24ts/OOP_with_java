class Addition{
    public int sum(int a,int b){
        return a + b;
    }
    public int sum(int a,int b,int c){
        return a + b + c;
    }
    public double sum(double a,double b){
        return a + b;
    }
    public double sum(double a,double b,double c){
        return a + b +c;
    }
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.sum(10, 2));
        System.out.println(a.sum(12.232, 0));
        System.out.println(a.sum(2, 3, 5));
        System.out.println(a.sum(1.232, 2.0343,3.22232));
    }
}