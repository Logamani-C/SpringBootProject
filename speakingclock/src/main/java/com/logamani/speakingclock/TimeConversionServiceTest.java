package com.logamani.speakingclock;
import com.logamani.speakingclock.service.TimeConversionService;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConversionServiceTest {

    private final TimeConversionService service = new TimeConversionService();

    @Test
    public void testConvertMidnight() {
        assertEquals("It's Midnight", service.convertTimeToWords(LocalTime.of(0, 0)));
    }

    @Test
	    public void testConvertMidday() {
	        assertEquals("It's Midday", service.convertTimeToWords(LocalTime.of(12, 0)));
	    }

	    @Test
	    public void testConvertRegularTime() {
	        assertEquals("It's eight thirty four", service.convertTimeToWords(LocalTime.of(8, 34)));
	    }
	}


