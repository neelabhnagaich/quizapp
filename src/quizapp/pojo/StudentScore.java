/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizapp.pojo;


public class StudentScore {

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPer(double per) {
        this.per = per;
    }

    public String getLanguage() {
        return language;
    }

    public double getPer() {
        return per;
    }
    private String language;
    private double per;
    
}
