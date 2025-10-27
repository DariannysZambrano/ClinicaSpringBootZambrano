package com.example.ClinicaSpringBootZambrano_BD.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ProfessionalCard")
public class TarjetaProfesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cardId;
    @Column(nullable = false)
    private Integer cardNumber;
    @Column(nullable = false)
    private LocalDate issueDate;
    @Column(length = 80, nullable = false)
    private String issuingEntity;
    @Column(length = 80, nullable = false)
    private String placeOfIssue;
    @Column(nullable = false)
    private LocalDate expirationDate;
    @Column(length = 80, nullable = false)
    private String status;
    @Column(length = 80, nullable = false)
    private String certifiedSpecialty;
    @Column(length = 1000, nullable = false)
    private String entityObservations;
    @Column(length = 50, nullable = false)
    private String cityOfIssue;


    @OneToOne(mappedBy = "tarjetaProfesional")
    private Medico medico;

    public TarjetaProfesional() {
    }

    public TarjetaProfesional(Integer cardId, Integer cardNumber, LocalDate issueDate, String issuingEntity, String placeOfIssue, LocalDate expirationDate, String status, String certifiedSpecialty, String entityObservations, String cityOfIssue, Medico medico) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.issuingEntity = issuingEntity;
        this.placeOfIssue = placeOfIssue;
        this.expirationDate = expirationDate;
        this.status = status;
        this.certifiedSpecialty = certifiedSpecialty;
        this.entityObservations = entityObservations;
        this.cityOfIssue = cityOfIssue;
        this.medico = medico;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssuingEntity() {
        return issuingEntity;
    }

    public void setIssuingEntity(String issuingEntity) {
        this.issuingEntity = issuingEntity;
    }

    public String getPlaceOfIssue() {
        return placeOfIssue;
    }

    public void setPlaceOfIssue(String placeOfIssue) {
        this.placeOfIssue = placeOfIssue;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCertifiedSpecialty() {
        return certifiedSpecialty;
    }

    public void setCertifiedSpecialty(String certifiedSpecialty) {
        this.certifiedSpecialty = certifiedSpecialty;
    }

    public String getEntityObservations() {
        return entityObservations;
    }

    public void setEntityObservations(String entityObservations) {
        this.entityObservations = entityObservations;
    }

    public String getCityOfIssue() {
        return cityOfIssue;
    }

    public void setCityOfIssue(String cityOfIssue) {
        this.cityOfIssue = cityOfIssue;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
