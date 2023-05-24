package ClassExecise;

public class Weather {
    public static void main(String[] args) {

        Weather weather = new Weather();

        System.out.println(weather.checkWeatherCondition("sunny b "));
    }



        public String checkWeatherCondition (String weatherCondition){

            switch (weatherCondition) {
                case "sunny":
                    return "Wear  sunglasses";
                case "windy":
                    return "Wear jacket";
                case "rainy":
                    return "Take umbrella";
                case "snowy":
                    return "Stay at home";
                default:
                    return "Check your weather";
            }
        }


}
