package org.deafsapps.android.dataadaptermanager.data;

import androidx.annotation.NonNull;

public class Student {

    // constants, if any - public static final...

    // class variables, if any - private...
    private int profilePic;
    private String name;
    private String extra;

    // constructors, if any - public...
    public Student(int anyProfilePic, String anyName, String anyExtra) {
        this.profilePic = anyProfilePic;
        this.name = anyName;
        this.extra = anyExtra;
    }

    public Student(String anyName, String anyExtra) {
        this.profilePic = -1;
        this.name = anyName;
        this.extra = anyExtra;
    }

    public Student(String anyName) {
        this(-1, anyName, "");
    }

//    public Student() {
//        this(-1, "Joe Bloggs", "");
//    }

    // getters and setters, if any - public...
    public int getProfilePic() {
        return profilePic;
    }

    public String getName() {
        return name;
    }

    public String getExtra() {
        return extra;
    }

    public void setProfilePic(int profilePic) {
        this.profilePic = profilePic;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    // overridden methods, if any - private/public...
    @NonNull
    @Override
    public String toString() {
        return "Student: " + this.name + ". More info: " + this.extra;
    }

    // public methods, if any - public...

    // private methods, if any - private...

}
