package Main;

import java.util.Comparator;
import java.util.List;

public class Function {
    private List<Product> productList;

    public Function(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void showList(){
        this.productList.forEach(System.out::println);
    }
    public void showSortedList(){
        this.productList.stream().sorted(Comparator.comparing(Product::getBrand)).forEach(System.out::println);
    }
    public void priceHigher400(){
        this.productList.stream().filter(el->el.getPrice()>400).forEach(System.out::println);
    }
    public void hasZeroAndHigherPrice(){
        this.productList.stream().filter(el -> String.valueOf(el.getSerialNumber()).contains("0") && el.getPrice() > 400).forEach(System.out::println);
    }
    public void higherPrice(){
        Product product = this.productList.stream().max(Comparator.comparing(Product::getPrice)).orElse(new Product());
        System.out.println(product);
    }
    public void findSerialNumber(Long serialNumber) throws WrongNumberExseption {
        Product product = productList.stream().filter(el -> el.getSerialNumber() == serialNumber).findFirst().orElseThrow(() -> new WrongNumberExseption("We don't have this product in the List"));
        System.out.println(product);
    }
}
