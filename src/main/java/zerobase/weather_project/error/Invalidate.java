package zerobase.weather_project.error;

public class Invalidate extends RuntimeException{

    private static final String message = "너무 과거 혹은 미래의 날짜입니다.";

    public Invalidate(){
        super(message);
    }

}
