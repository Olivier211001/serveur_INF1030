package com.example.demo.dto;

public class PatientDTO {
    private String id;
    private String nom;
    private String prenom;
    private String sex;
    private String dob;
    private String adresse;
    private String tel;
    private String email;
    private String photo;

    public PatientDTO() {
    }

    public PatientDTO(String id, String nom, String prenom, String sex, String dob, String adresse, String tel,
            String email, String photo) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sex = sex;
        this.dob = dob;
        this.adresse = adresse;
        this.tel = tel;
        this.email = email;
        this.photo = photo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
