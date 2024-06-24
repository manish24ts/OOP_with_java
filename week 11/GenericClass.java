public class GenericClass<T>{
    T obj;
    public GenericClass(T obj){
        this.obj = obj;
    }
    public T getData(){
        return this.obj;
    }
    public static void main(String[] args) {
        GenericClass<Integer> actualObj1 = new GenericClass<>(100);
        System.out.println(actualObj1.getData());
        GenericClass<String> actualObj2 = new GenericClass<>("Java");
        System.out.println(actualObj2.getData());
        GenericClass<Float> actualObj3 = new GenericClass<>(25.9f);
        System.out.println(actualObj3.getData());
    }
}