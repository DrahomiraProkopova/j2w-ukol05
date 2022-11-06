package cz.czechitas.java2webapps.ukol5.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class RegistraceForm {

    @NotBlank
    private String jmeno;

    @NotBlank
    private String prijmeni;

    @NotBlank
    private String datumNarozeni;

    @NotBlank
    private String pohlavi;

    @NotBlank
    private String turnus;

    private String telefon;

    @Email
    private String email;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(String datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(String pohlavi) {
        this.pohlavi = pohlavi;
    }

    public String getTurnus() {
        return turnus;
    }

    public void setTurnus(String turnus) {
        this.turnus = turnus;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
