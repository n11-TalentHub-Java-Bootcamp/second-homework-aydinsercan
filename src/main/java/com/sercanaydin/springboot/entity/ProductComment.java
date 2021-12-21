package com.sercanaydin.springboot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "URUNYORUM")
public class ProductComment implements Serializable {
    @SequenceGenerator(name ="generator", sequenceName = "URUNYORUM_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "YORUM", nullable = false, length = 500)
    private String yorum;

    @Column(name ="YORUMTARIHI",nullable = false)
    private Date yorumtarihi;

    @Column(name ="URUN_ID",nullable = false)
    private Long urun_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_KULLANICI", foreignKey = @ForeignKey(name = "FK_URUNYORUM_KULLANICI_ID"))
    private User user;

    @Override
    public String toString() {
        return "ProductComment{" +
                "id=" + id +
                ", yorum='" + yorum + '\'' +
                ", yorumtarihi=" + yorumtarihi +
                ", urun_id=" + urun_id +
                ", user=" + user +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public Date getYorumtarihi() {
        return yorumtarihi;
    }

    public void setYorumtarihi(Date yorumtarihi) {
        this.yorumtarihi = yorumtarihi;
    }

    public Long getUrun_id() {
        return urun_id;
    }

    public void setUrun_id(Long urun_id) {
        this.urun_id = urun_id;
    }

    public User getKullanici() {
        return user;
    }

    public void setKullanici(User user) {
        this.user = user;
    }
}
