package Chapter6;

public class Static {
    public static void main(String[] args) { 
        MyDate student1 = new MyDate(12,12,12);
        MyDate student2;
        student2 = new MyDate(13,12,12);
        System.out.println(student1.equals(student2));
        
    }
    public static class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(int day, int month, int year ) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public  boolean equals(Object o) {
            boolean result = false;
            if ( (o != null) && (o instanceof MyDate) ) {
                MyDate d = (MyDate) o;
                if ((day == d.day) &&
                        (month == d.month) &&
                        (year == d.year)) {
                    result = true;
                } }
            return result;
        } }
}
