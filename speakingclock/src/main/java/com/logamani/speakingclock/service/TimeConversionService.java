package com.logamani.speakingclock.service;

	import org.springframework.stereotype.Service;

	import java.time.LocalTime;

	@Service
	public class TimeConversionService {

	    private static final String[] HOURS = {"twelve", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven"};
	    private static final String[] MINUTES = {"o'clock", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
	                                             "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", 
	                                             "nineteen", "twenty", "twenty-one", "twenty-two", "twenty-three", "twenty-four", 
	                                             "twenty-five", "twenty-six", "twenty-seven", "twenty-eight", "twenty-nine", "thirty",
	                                             "thirty-one", "thirty-two", "thirty-three", "thirty-four", "thirty-five", "thirty-six",
	                                             "thirty-seven", "thirty-eight", "thirty-nine", "forty", "forty-one", "forty-two", 
	                                             "forty-three", "forty-four", "forty-five", "forty-six", "forty-seven", "forty-eight",
	                                             "forty-nine", "fifty", "fifty-one", "fifty-two", "fifty-three", "fifty-four", 
	                                             "fifty-five", "fifty-six", "fifty-seven", "fifty-eight", "fifty-nine"};

	    public String convertTimeToWords(LocalTime time) {
	        int hour = time.getHour();
	        int minute = time.getMinute();

	        if (hour == 0 && minute == 0) {
	            return "It's Midnight";
	        } else if (hour == 12 && minute == 0) {
	            return "It's Midday";
	        }

	        String hourInWords = HOURS[hour % 12];
	        String minuteInWords = minute == 0 ? "o'clock" : MINUTES[minute];

	        return String.format("It's %s %s", hourInWords, minuteInWords);
	    }
	}
