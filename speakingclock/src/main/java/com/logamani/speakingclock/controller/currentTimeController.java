package com.logamani.speakingclock.controller;

import com.logamani.speakingclock.exception.TimeFormatException;
import com.logamani.speakingclock.service.TimeConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;

@RestController
public class currentTimeController 
{

    private final TimeConversionService timeConversionService;

    public currentTimeController(TimeConversionService timeConversionService) {
        this.timeConversionService = timeConversionService;
    }

    @GetMapping("/current-time")
    public String getCurrentTimeInWords() {
        LocalTime currentTime = LocalTime.now();
        return timeConversionService.convertTimeToWords(currentTime);
    }
}
