package com.taxi.translation.service;

import com.taxi.framework.translation.dto.BaseResponseTranslationDto;
import com.taxi.framework.translation.dto.BaseTranslationDto;
import com.taxi.framework.translation.service.AbstractTranslationServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TranslationServiceImpl extends AbstractTranslationServiceImpl<BaseTranslationDto, BaseResponseTranslationDto> {
}
