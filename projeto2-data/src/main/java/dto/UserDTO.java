package dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * Entity implementation class for Entity: User
 *
 */


public class UserDTO implements Serializable {

    private long id;
    private String finalName;
    private String lstName;
    private String country;
    private String email;
    private String password;

    private List<ItemDTO> boughtItems;

    public UserDTO(long id, String finalName, String lstName, String country, String email, String password) {
        this.id = id;
        this.finalName = finalName;
        this.lstName = lstName;
        this.country = country;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFinalName() {
        return finalName;
    }

    public void setFinalName(String finalName) {
        this.finalName = finalName;
    }

    public String getLstName() {
        return lstName;
    }

    public void setLstName(String lstName) {
        this.lstName = lstName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
