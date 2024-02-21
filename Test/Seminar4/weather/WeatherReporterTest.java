package Seminar4.weather;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;

class WeatherReporterTest {
    @Test
    void testingGenerateReport() {
        WeatherService mockWeatherService = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);
        when(mockWeatherService.getCurrentTemperature()).thenReturn(15);

        String str = weatherReporter.generateReport();

        assertThat(str).isEqualTo("Текущая температура: " + 15 + " градусов.");
    }

}