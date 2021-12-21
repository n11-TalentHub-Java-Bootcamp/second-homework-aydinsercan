package com.sercanaydin.springboot.controller;

import com.sercanaydin.springboot.entity.Urun;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class YorumController {

    @Autowired
    private YorumEntityService yorumEntityService;
    @GetMapping("")
    public MappingJacksonValue findAllUrunList() {

        List<Urun> yorumList = yorumEntityService.findAll();

        String filterName = "UrunFilter";

        SimpleFilterProvider filters = getUrunFilterProvider(filterName);

        MappingJacksonValue mapping = new MappingJacksonValue(yorumList);

        mapping.setFilters(filters);

        return mapping;
    }

}
