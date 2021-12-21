package com.sercanaydin.springboot.converter;

import com.sercanaydin.springboot.dto.KategoriDto;
import com.sercanaydin.springboot.entity.Kategori;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface KategoriConverter {

    KategoriConverter INSTANCE = Mappers.getMapper(KategoriConverter.class);

    @Mapping(target = "ustKategoriId", source = "ustKategori.id")
    KategoriDto convertKategoriToKategoriDto(Kategori kategori);

    @Mapping(target = "ustKategoriId", source = "ustKategori.id")
    List<KategoriDto> convertAllKategoriListToKategoriDtoList(List<Kategori> kategoriList);

    Kategori convertKategoriDtoToKategori(KategoriDto kategoriDto);
}
