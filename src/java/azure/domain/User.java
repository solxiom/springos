/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package azure.domain;

/**
 *
 * @author kavan
 */
public class User {
    private String name;
    private String password;
    private String user_id;
    private String e_mail;
    private String[] fav_numbers;
    

    public User() {
    }

    public String[] getFav_numbers() {
        return fav_numbers;
    }

    public void setFav_numbers(String[] fav_numbers) {
        this.fav_numbers = fav_numbers;
    }
       
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
    
    
    
}
