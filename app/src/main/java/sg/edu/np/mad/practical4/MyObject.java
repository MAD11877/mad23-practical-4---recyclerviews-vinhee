package sg.edu.np.mad.practical4;

import android.widget.ImageView;

public class MyObject {
    private String myUser;
    private String myDescription;

    public MyObject(String myUser, String myDescription){
        this.myUser = myUser;
        this.myDescription = myDescription;
    }

    public MyObject(){

    }

    public String getMyUser() {
        return myUser;
    }

    public void setMyUser(String myUser) {
        this.myUser = myUser;
    }

    public String getMyDescription() {
        return myDescription;
    }

    public void setMyDescription(String myDescription) {
        this.myDescription = myDescription;
    }

}
