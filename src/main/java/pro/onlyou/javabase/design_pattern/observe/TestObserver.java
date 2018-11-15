package pro.onlyou.javabase.design_pattern.observe;

public class TestObserver {
    public static void main(String[] args){
        ProductList productList = ProductList.getInstance();

        productList.addObserver(new JDObserver());
        productList.addObserver(new TBObserver());

        productList.addProduct("睡衣");
    }
}
