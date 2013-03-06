/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package azure.domain;

/**
 *
 * @author kavan
 */
public class Shop {

    String name;
    String staffName[];

    public Shop() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getStaffName() {
        return staffName;
    }

    public void setStaffName(String[] staffName) {
        this.staffName = staffName;
    }
}
