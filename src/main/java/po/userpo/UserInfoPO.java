/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.userpo;

/**
 *
 * @author Administrator
 */
public class UserInfoPO {
    private String ID;
    private String name;
    private String psw;
    private String type;
    private String depart;
    private String sex;
    private String identification;

    public UserInfoPO(String ID, String name, String psw, String type, 
            String depart, String sex, String identification) {
        this.ID = ID;
        this.name = name;
        this.psw = psw;
        this.type = type;
        this.depart = depart;
        this.sex = sex;
        this.identification = identification;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
