package DiaryTest;
import java.util.ArrayList;
import java.util.List;
public class Diary {
    private boolean isLocked = true;
    private final String password;
    private int gistCounter = 0;
    private final List<Gist> gists = new ArrayList<>();

    public Diary(String userName, String password) {

        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlockWith(String password) {
        boolean passwordIsCorrect = password.equals(this.password);
        if (passwordIsCorrect) unlockDiary(); //You can push this isLocked=false into a new private method and call it.
        //if(passwordIsCorrect) unlockDiary();

    }

    private boolean unlockDiary() {
        return isLocked = false;
    }

    public void lock() {

        isLocked = true;
    }

    public void addGist(String title, String body) {
        gistCounter = 0;
        Gist newGist = new Gist(title, body);
        newGist.setId(generateCount());
        gists.add(newGist);
        gistCounter++;
    }

    public int numberOfGists() {
        return gists.size();
    }

    public Gist findGistByTitle(String title) {
        for (Gist gist : gists) {
            if (gist.getTitle().equals(title))
                return gist;
        }
        return null;
    }

    public void deleteGistById(int gist) {
        for(Gist git : gists) {
            if (git.getId() == gist)
                gists.remove(git);
            gistCounter--;
            break;

        }
    }
        public void removeGistByTitle(String title) {
        for (Gist gist : gists) {
            if (title.equals(gist.getTitle()))
                gists.remove(gist);
            gistCounter--;
            break;
        }

    }
    public int count (){
        return gistCounter;
    }
    public int generateCount() {
        return gistCounter+1;
    }
}

