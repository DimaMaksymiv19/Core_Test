package Main;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, WrongNumberExseption {
        ReadFile readFile = new ReadFile("C:\\Users\\dimam\\IdeaProjects\\Core_Test\\src\\Main\\File.txt");
        List<Product> productList = readFile.read();
        Function function = new Function(productList);

        function.showList();
        System.out.println();

        function.showSortedList();
        System.out.println();

        function.priceHigher400();
        System.out.println();

        function.hasZeroAndHigherPrice();
        System.out.println();

        function.higherPrice();
        System.out.println();

        function.findSerialNumber(123456L);
    }
}
