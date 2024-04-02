class bank{
    int getBalance(){
        return 0;
    }
}
class bankA extends bank{
    int getBalance(int balance){
        return balance;
    }
}
class bankB extends bank{
    int getBalance(int balance){
        return balance;
    }
}
class bankC extends bank{
    int getBalance(int balance){
        return balance;
    }
}
class bankDemo{
    public static void main(String[] args) {
        bankA a = new bankA();
        bankB b = new bankB();
        bankC c = new bankC();
        System.out.println("$"+a.getBalance(1000));
        System.out.println("$"+b.getBalance(1500));
        System.out.println("$"+c.getBalance(2000));
    }
}