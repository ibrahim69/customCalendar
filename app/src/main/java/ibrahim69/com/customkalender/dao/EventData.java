package ibrahim69.com.customkalender.dao;

import java.util.ArrayList;

/**
 * Created by Dhaval Soneji on 4/4/16.
 */

public class EventData {
    private String section;
    private ArrayList<dataAboutDate> data;

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public ArrayList<dataAboutDate> getData() {
        return data;
    }

    public void setData(ArrayList<dataAboutDate> data) {
        this.data = data;
    }
}
