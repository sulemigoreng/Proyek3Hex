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
public class Database {

    private ArrayList<Courier> courier = new ArrayList();
    private ArrayList<Product> product = new ArrayList();
    private ArrayList<Packages> packages = new ArrayList();

    public Database(ArrayList<Courier> courier, ArrayList<Product> product,
            ArrayList<Packages> packages) {
        this.courier = courier;
        this.product = product;
        this.packages = packages;
    }

    /**
     * @return the courier
     */
    public ArrayList<Courier> getCourier() {
        return courier;
    }

    /**
     * @param courier the courier to set
     */
    public void setCourier(ArrayList<Courier> courier) {
        this.courier = courier;
    }

    /**
     * @return the courier[i]
     */
    public Courier getCourier(int i) {
        return courier.get(i);
    }

    /**
     * @param courier the courier to set
     */
    public void setCourier(Courier courier, int i) {
        this.courier.set(i, courier);
    }

    /**
     * @return the product
     */
    public ArrayList<Product> getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    /**
     * @param i
     * @return the product[i]
     */
    public Product getProduct(int i) {
        return product.get(i);
    }

    /**
     * @param product the product to set
     * @param i
     */
    public void setProduct(Product product, int i) {
        this.product.set(i, product);
    }

    /**
     * @return the packages
     */
    public ArrayList<Packages> getPackages() {
        return packages;
    }

    /**
     * @param packages the packages to set
     */
    public void setPackages(ArrayList<Packages> packages) {
        this.packages = packages;
    }

    /**
     * @return the packages
     */
    public Packages getPackages(int i) {
        return packages.get(i);
    }

    /**
     * @param packages the packages to set
     */
    public void setPackages(Packages packages, int i) {
        this.packages.set(i, packages);
    }

}
