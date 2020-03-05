/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageclassification;

/**
 *
 * @author Fadly TR
 */
public class Courier {

    private String idCourier;
    private String courierName;
    private String courierPhone;

    public Courier(String idCourier, String courierName, String courierPhone) {
        this.idCourier = idCourier;
        this.courierName = courierName;
        this.courierPhone = courierPhone;
    }

    /**
     * @return the idCourier
     */
    public String getIdCourier() {
        return idCourier;
    }

    /**
     * @param idCourier the idCourier to set
     */
    public void setIdCourier(String idCourier) {
        this.idCourier = idCourier;
    }

    /**
     * @return the courierName
     */
    public String getCourierName() {
        return courierName;
    }

    /**
     * @param courierName the courierName to set
     */
    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    /**
     * @return the courierPhone
     */
    public String getCourierPhone() {
        return courierPhone;
    }

    /**
     * @param courierPhone the courierPhone to set
     */
    public void setCourierPhone(String courierPhone) {
        this.courierPhone = courierPhone;
    }

}
