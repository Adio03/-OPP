package Enums;

public enum Nigeria {
    North_Central("Benue", "FCT", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"),
    North_East("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    North_West("Kaduna", "Kastina", "Kano", "Kebbi", "Sokoto", "jigawa", "Zamfara"),
    South_East("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    South_south("Akwa-ibom", "Bayelsa", "Cross_River", "Delta", "Edo", "Rivers"),
    South_West("Ekiti", "Lagos", "Osun", "Ondo", "Oyo");

    private String[] states;

    Nigeria(String... states) {
        this.states = states;
    }

    public String[] northCentralStates(Nigeria north_Central) {

        North_Central.valueOf(); {
            return states;


        }


    }

    private void valueOf() {
    }

}