package com.sercanaydin.springboot.dao;

import com.sercanaydin.springboot.entity.Kategori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KategoriDao extends JpaRepository<Kategori, Long> {

    List<Kategori> findAllByUstKategoriIsNullOrderByAdiDesc();

    List<Kategori> findAllByAdiEndsWith(String adi);

}