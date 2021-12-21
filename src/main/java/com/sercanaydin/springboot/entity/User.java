package com.sercanaydin.springboot.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "KULLANICI")
public class User implements Serializable {
    @SequenceGenerator(name ="generator", sequenceName = "KULLANICI_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ADI", nullable = false, length = 50)
    private String adi;

    @Column(name ="SOYADI",nullable = false, length = 50)
    private String soyadi;

    @Column(name ="EMAIL",nullable = false, length = 50)
    private String email;

    @Column(name ="TELEFON",nullable = false, length = 15)
    private String telefon;

    @Column(name ="KULLANICI_ADI",nullable = false, length = 20)
    private String kullaniciAdi;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
