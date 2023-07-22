package DiaryTest;

public class Gist {
    private String title;
    private String body;
    private int id;


    public int getId() {
        return id;
    }

    public void setId(int iD) {
        this.id = iD;
    }

    public Gist(String title, String body) {
        this.title = title;
        this.body = body;

    }

    public Gist() {
    }

    public String getTitle() {
        return title;
    }

    public String getBody(){

        return body;
    }

}
