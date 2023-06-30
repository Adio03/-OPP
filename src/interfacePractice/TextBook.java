package interfacePractice;

import java.util.ArrayList;
import java.util.List;

public class TextBook implements interfaceClass{
    private List<TextBook> text = new ArrayList<>();
    private int counter ;

    @Override
    public TextBook save(TextBook textBook) {
        text.add(textBook);
        counter ++;
        return textBook;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public long count() {
      return   counter++;
    }
}
