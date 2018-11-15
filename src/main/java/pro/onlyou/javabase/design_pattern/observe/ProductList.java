package pro.onlyou.javabase.design_pattern.observe;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ProductList extends Observable {
    private ProductList productList;

    private List<String> products;

    private ProductList(List<String> products){
        this.products = products;
    }

    private static class NewInstance{
        private static final ProductList pl = new ProductList(new ArrayList<>());
    }

    public static ProductList getInstance(){
        return NewInstance.pl;
    }


    public void addProductListObserver(Observer observer){
        this.addObserver(observer);
    }

    public void addProduct(String product){
        this.products.add(product);
        System.out.println("新增了产品 ： " + product);
        this.setChanged();
        this.notifyObservers(product);
    }
}
