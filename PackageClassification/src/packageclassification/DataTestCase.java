/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageclassification;

import java.util.ArrayList;

/**
 *
 * @author Fadly TR
 */
public class DataTestCase {
    
    private Database database;
    
    public void testCaseProduct(){
        Product product = new Product("B1", "Peci"); database.setProduct(product, 0);
        product = new Product("B2", "Kerudung"); database.setProduct(product, 1);
        product = new Product("B3", "Mukena"); database.setProduct(product, 2);
        product = new Product("B4", "Sarung"); database.setProduct(product, 3);
        product = new Product("B5", "Baju Koko"); database.setProduct(product, 4);
        product = new Product("B6", "Pin Korea"); database.setProduct(product, 5);
        product = new Product("B7", "Gamis"); database.setProduct(product, 6);
        product = new Product("B8", "Sorban"); database.setProduct(product, 7);
        product = new Product("B9", "Cadar"); database.setProduct(product, 8);
        product = new Product("B10", "Kaos kaki"); database.setProduct(product, 9);
        product = new Product("C1", "Kurma"); database.setProduct(product, 10);
        product = new Product("C2", "Susu Kambing"); database.setProduct(product, 11);
        product = new Product("C3", "Susu Sapi"); database.setProduct(product, 12);
        product = new Product("C4", "Canai"); database.setProduct(product, 13);
        product = new Product("C5", "Kulit kebab"); database.setProduct(product, 14);
        product = new Product("C6", "Gulai Kambing"); database.setProduct(product, 15);
        product = new Product("C7", "Rendang"); database.setProduct(product, 16);
        product = new Product("C8", "Bubuk kari"); database.setProduct(product, 17);
        product = new Product("C9", "Sambal"); database.setProduct(product, 18);
        product = new Product("C10", "Cabe bubuk"); database.setProduct(product, 19);
    }

    public void testCaseCourier1256() {
        ArrayList<Courier> couriers = new ArrayList();
        database.setCourier(couriers);
        Courier courier = new Courier("P1", "Fadly", "087878787871"); database.setCourier(courier, 0);
        courier = new Courier("P2", "Farhan", "087878787872"); database.setCourier(courier, 1);
        courier = new Courier("P3", "Hamzah", "087878787873"); database.setCourier(courier, 2);
        courier = new Courier("P4", "Ilham", "087878787874"); database.setCourier(courier, 3);
        courier = new Courier("P5", "Reyhan", "087878787875"); database.setCourier(courier, 4);
        courier = new Courier("P6", "Regawa", "087878787876"); database.setCourier(courier, 5);
        courier = new Courier("P7", "Ahmad", "087878787877"); database.setCourier(courier, 6);
        courier = new Courier("P7", "Aji", "087878787877"); database.setCourier(courier, 7);
        courier = new Courier("P9", "Naufal", "087878787879"); database.setCourier(courier, 8);
        courier = new Courier("P10", "Ali", "087878787880"); database.setCourier(courier, 9);
    }
    
    public void testCaseCourier3478(){
        ArrayList<Courier> couriers = new ArrayList();
        database.setCourier(couriers);
        Courier courier = new Courier("P1", "Fadly", "087878787871"); database.setCourier(courier, 0);
        courier = new Courier("P2", "Farhan", "087878787872"); database.setCourier(courier, 1);
    }
    
    public void isiDatabasePackages(){
        Packages packages;
        ArrayList<Packages> pack = new ArrayList();
        ArrayList<Product> products = new ArrayList();
        /*
        public Packages(ArrayList<Product> contains, String resi, String customerName,
            String customerPhone, String street, String zipCode, String district,
            String city, double weight, double length, double width, double height)
        */
        products.set(0, database.getProduct(1)); products.set(1, database.getProduct(0));
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(1)); products.set(1, database.getProduct(2));
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(3)); products.set(1, database.getProduct(10));
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(11)); products.remove(1);
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(19)); products.set(1, database.getProduct(12));
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(4)); products.set(1, database.getProduct(5));
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(9)); products.set(1, database.getProduct(2)); products.set(2, database.getProduct(5));
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(10)); products.set(1, database.getProduct(13)); products.remove(2);
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(12)); products.set(1, database.getProduct(14));
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(6)); products.set(1, database.getProduct(3));
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(1)); products.set(1, database.getProduct(0)); 
        products.set(2, database.getProduct(3)); products.set(3, database.getProduct(4));
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(1)); products.set(1, database.getProduct(0)); products.remove(2); products.remove(3);
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        products.set(0, database.getProduct(1)); products.set(1, database.getProduct(0));
        packages = new Packages(products, "resi", "customerName", "customerPhone", "street", "zipCode", "district", "city", 0, 0, 0, 0);
        pack.add(packages);
        database.setPackages(pack);
    }
}
