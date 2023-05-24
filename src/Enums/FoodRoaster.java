package Enums;

public enum FoodRoaster {
        MONDAY(2,"RICE", "EGG", "FISH"),
        TEUSDAY(7, "BEANS", "BREAD","RICE","EGG","MEAT"),
        WEDNESDAY(5,"RICE", "EGG", "FISH"),
        THURSDAY(8,"BEANS", "BREAD","RICE","EGG","MEAT"),
        FRIDAY(9,"RICE", "EGG", "FISH");
        private String[] food;
        private int size;

        FoodRoaster(int size, String...food){
            this.size = size;
            this.food = food;
        }
        public String[] getFood()
        {
            return food;
        }
        public int getSize(){
            return size;
        }

    }














