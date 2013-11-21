/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package po.selectionpo;

/**
 *
 * @author Administrator
 */
public class SelectionPO {

    private String courseNum;
    private String stuID;
    private double grade;

    public SelectionPO(String num, String id) {
        courseNum = num;
        stuID = id;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrader() {
        return this.grade;
    }

    public String getCouseNum() {
        return courseNum;
    }

    public String stuID() {
        return stuID;
    }
}
