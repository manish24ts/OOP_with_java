public class GenericFunction{
    public <T, U> void displayData(T value1, U value2){
        System.out.println("( "+ value1.getClass().getName()+" "+value2.getClass().getName()+ " )");
    }
    public static void main(String[] args) {
        GenericFunction obj = new GenericFunction();
        obj.displayData(45.5f,10);
        obj.displayData(10,10);
        obj.displayData("HI","c");
    }
}