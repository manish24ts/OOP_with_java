public class GenericInterface {
    public static void main(String[] args) {
        // Create a container for Strings
        Container<String> stringContainer = new StringContainer();
        stringContainer.setItem("Hello, Generics!");
        System.out.println("String container holds: " + stringContainer.getItem());

        // Create a container for Integers
        Container<Integer> integerContainer = new IntegerContainer();
        integerContainer.setItem(42);
        System.out.println("Integer container holds: " + integerContainer.getItem());
    }
}


public interface Container<T> {
    void setItem(T item);
    T getItem();
}
// Implement the generic interface for String type
public class StringContainer implements Container<String> {
    private String item;
    
    @Override
    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String getItem() {
        return item;
    }
}

// Implement the generic interface for Integer type
public class IntegerContainer implements Container<Integer> {
    private Integer item;
    
    @Override
    public void setItem(Integer item) {
        this.item = item;
    }

    @Override
    public Integer getItem() {
        return item;
    }
}
