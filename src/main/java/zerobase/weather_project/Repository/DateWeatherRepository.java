package zerobase.weather_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.weather_project.domain.DateWeather;

import java.time.LocalDate;
import java.util.List;

public interface DateWeatherRepository extends JpaRepository<DateWeather,LocalDate> {

    List<DateWeather> findAllByDate(LocalDate date);

}
