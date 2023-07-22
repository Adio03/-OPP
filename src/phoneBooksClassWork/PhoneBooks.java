package phoneBooksClassWork;

import java.util.ArrayList;
import java.util.List;

public class PhoneBooks {

    private List<PhonebookClasswork>phonebookClassworks = new ArrayList<>();
    private List<String> paswords = new ArrayList<>();
    private List<String> userNames = new ArrayList<>();
    public void createPhoneBooks(String userName, String password) {
        phonebookClassworks.add(new PhonebookClasswork(userName,password));
        paswords.add(password);
        userNames.add(userName);
    }
    public List<PhonebookClasswork> listOfPhonebook() {
        return phonebookClassworks;
    }

    public void unlockAll() {
        for (int index = 0; index < phonebookClassworks.size(); index++) {
            phonebookClassworks.get(index).unlockWith(paswords.get(index));
        }
    }
}
