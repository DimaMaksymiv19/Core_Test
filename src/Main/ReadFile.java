package Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReadFile {
    private String filePath;

    public ReadFile(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    public List<Product> read() throws IOException {
        List<String> itemListStr = Files.readAllLines(Paths.get(filePath));
        List<Product> deviceList = new ArrayList<>();

        for (String el : itemListStr){
            List<String> listForCreateDevice = Arrays.asList(el.split(","));
            deviceList.add(new Product(Integer.parseInt(listForCreateDevice.get(0).trim()),
                    listForCreateDevice.get(1).trim(),listForCreateDevice.get(2).trim(),
                    Integer.parseInt(listForCreateDevice.get(3).trim())));
        }
        return deviceList;
    }
}
