package com.logamani.speakingclock.controller;

import com.logamani.speakingclock.exception.TimeFormatException;
import com.logamani.speakingclock.service.TimeConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

@RestController
public class userInputTimeController {
	   private final TimeConversionService timeConversionService;

	    public userInputTimeController(TimeConversionService timeConversionService) {
	        this.timeConversionService = timeConversionService;
	    }

	    @GetMapping("/convert-time")
	    public String convertUserTime(@RequestParam String time) {
	        try {
	            LocalTime userTime = LocalTime.parse(time);
	            return timeConversionService.convertTimeToWords(userTime);
	        } catch (DateTimeParseException e) {
	            throw new TimeFormatException("Invalid time format. Please use HH:mm.");
	        }
	    }
}
