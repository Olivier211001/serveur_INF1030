package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class VisitDTO {
    private long id;
    private int pressionSystolique;
    private int pressionDiastolique;
    private int glycemie;
    private int frequenceRespiratoire;
    private int frequenceCardiaque;
    private int spO2;
    private String patientId;
    private String date;
    private String etatGeneral;
    private String notesSupplementaires;
    private int poids;
    private List<String> photos = new ArrayList<>();
    private String nurseId;
    private String doctorId;
    private String commentairePression;
    private String commentairePoids;
    private String commentaireGlycemie;
    private String commentaireFrequenceCardiaque;
    private String commentaireFrequenceRespiratoire;
    private String commentaireSpo2;
    private double longitude;
    private double latitude;

    public VisitDTO() {
    }

    // Getters et setters (tu peux utiliser Lombok si tu veux réduire la taille du
    // code)

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPressionSystolique() {
        return pressionSystolique;
    }

    public void setPressionSystolique(int pressionSystolique) {
        this.pressionSystolique = pressionSystolique;
    }

    public int getPressionDiastolique() {
        return pressionDiastolique;
    }

    public void setPressionDiastolique(int pressionDiastolique) {
        this.pressionDiastolique = pressionDiastolique;
    }

    public int getGlycemie() {
        return glycemie;
    }

    public void setGlycemie(int glycemie) {
        this.glycemie = glycemie;
    }

    public int getFrequenceRespiratoire() {
        return frequenceRespiratoire;
    }

    public void setFrequenceRespiratoire(int frequenceRespiratoire) {
        this.frequenceRespiratoire = frequenceRespiratoire;
    }

    public int getFrequenceCardiaque() {
        return frequenceCardiaque;
    }

    public void setFrequenceCardiaque(int frequenceCardiaque) {
        this.frequenceCardiaque = frequenceCardiaque;
    }

    public int getSpO2() {
        return spO2;
    }

    public void setSpO2(int spO2) {
        this.spO2 = spO2;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEtatGeneral() {
        return etatGeneral;
    }

    public void setEtatGeneral(String etatGeneral) {
        this.etatGeneral = etatGeneral;
    }

    public String getNotesSupplementaires() {
        return notesSupplementaires;
    }

    public void setNotesSupplementaires(String notesSupplementaires) {
        this.notesSupplementaires = notesSupplementaires;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getCommentairePression() {
        return commentairePression;
    }

    public void setCommentairePression(String commentairePression) {
        this.commentairePression = commentairePression;
    }

    public String getCommentairePoids() {
        return commentairePoids;
    }

    public void setCommentairePoids(String commentairePoids) {
        this.commentairePoids = commentairePoids;
    }

    public String getCommentaireGlycemie() {
        return commentaireGlycemie;
    }

    public void setCommentaireGlycemie(String commentaireGlycemie) {
        this.commentaireGlycemie = commentaireGlycemie;
    }

    public String getCommentaireFrequenceCardiaque() {
        return commentaireFrequenceCardiaque;
    }

    public void setCommentaireFrequenceCardiaque(String commentaireFrequenceCardiaque) {
        this.commentaireFrequenceCardiaque = commentaireFrequenceCardiaque;
    }

    public String getCommentaireFrequenceRespiratoire() {
        return commentaireFrequenceRespiratoire;
    }

    public void setCommentaireFrequenceRespiratoire(String commentaireFrequenceRespiratoire) {
        this.commentaireFrequenceRespiratoire = commentaireFrequenceRespiratoire;
    }

    public String getCommentaireSpo2() {
        return commentaireSpo2;
    }

    public void setCommentaireSpo2(String commentaireSpo2) {
        this.commentaireSpo2 = commentaireSpo2;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
