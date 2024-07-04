package com.taxi.framework.translation.controller;

import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.taxi.framework.translation.dto.BaseResponseTranslationDto;
import com.taxi.framework.translation.dto.BaseTranslationDto;
import com.taxi.framework.translation.dto.GeoIP;
import com.taxi.framework.translation.service.GeoIPLocationService;
import com.taxi.framework.translation.service.TranslationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;

public class AbstractTranslationController <T extends BaseTranslationDto, Y extends BaseResponseTranslationDto>{

    protected final TranslationService<T,Y> translationService;
    protected final GeoIPLocationService geoIPLocationService;

    public AbstractTranslationController(TranslationService<T, Y> translationService, GeoIPLocationService geoIPLocationService) {
        this.translationService = translationService;
        this.geoIPLocationService = geoIPLocationService;
    }

    @GetMapping("/test")
    public ResponseEntity<GeoIP> refresh() throws IOException, GeoIp2Exception {
        return ResponseEntity.ok(geoIPLocationService.getLocation("103.130.144.0"));
    }
}
