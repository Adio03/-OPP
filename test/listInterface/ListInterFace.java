package listInterface;



public class ListInterFace {
    private int[] elements;
    private int counter;
    private int size;

    public ListInterFace() {
        elements = new int[10];
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public void add(int element) {
        elements[counter] = element;
        counter++;
    }

    public int size() {
        return counter;
    }

    public int remove(int index) {
        for (int ints = index; ints > counter - 1; ints++)
            elements[ints] = elements[ints + 1];
        counter--;
        return counter;
    }

    public int removeElement( int element) {
        int valueHolder = 0;
        for (int index = 0; index < counter -1;index++) {
            if (elements[index] == element){
                valueHolder = elements[index+1];
                elements[index] = valueHolder;
                counter--;
            }
        }
        return counter;

        }

    public int get(int index) {
        return elements[index];
    }
    public String toString(){
        String container = "[ ";
        for (int index =0 ; index < counter; index++){
            container += elements[index] + ", ";

        }
        container += "]";
        return container;
    }


}

