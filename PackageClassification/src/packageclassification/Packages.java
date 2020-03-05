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
public class Packages {

    private ArrayList<Product> contains = new ArrayList();
    private String resi;
    private String customerName;
    private String customerPhone;
    private String street;
    private String zipCode;
    private String district;
    private String city;
    private double weight;
    private double length;
    private double width;
    private double height;

    public Packages(ArrayList<Product> contains, String resi, String customerName,
            String customerPhone, String street, String zipCode, String district,
            String city, double weight, double length, double width, double height) {
        this.contains = contains;
        this.resi = resi;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.street = street;
        this.zipCode = zipCode;
        this.district = district;
        this.city = city;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * @return the contains
     */
    public ArrayList<Product> getContains() {
        return contains;
    }

    /**
     * @param contains the contains to set
     */
    public void setContains(ArrayList<Product> contains) {
        this.contains = contains;
    }
    
    /**
     * @param i
     * @return the contains[i]
     */
    public Product getContainsProduct(int i) {
        return contains.get(i);
    }

    /**
     * @param product
     * @param i
     */
    public void setContains(Product product, int i) {
        this.contains.set(i, product);
    }

    /**
     * @return the resi
     */
    public String getResi() {
        return resi;
    }

    /**
     * @param resi the resi to set
     */
    public void setResi(String resi) {
        this.resi = resi;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the customerPhone
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * @param customerPhone the customerPhone to set
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

}
