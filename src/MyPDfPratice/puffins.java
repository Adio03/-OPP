package MyPDfPratice;

public class puffins {
    private puffins(){

    }
    public int puffinsCount(int puffins) {
        double growthRate = 0.04;
        int population, year;
        population = 800;
        year = 0;
        while (population <= 1200) {
            population = (int) (population * (1 + growthRate));

        }

return puffins;
    }
}
