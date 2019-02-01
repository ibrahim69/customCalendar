package ibrahim69.com.customkalender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ibrahim69.com.customkalender.CustomCalendar;
import ibrahim69.com.customkalender.dao.EventData;
import ibrahim69.com.customkalender.dao.dataAboutDate;
import ibrahim69.com.customkalender.utils.CalendarUtils;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private CustomCalendar customCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customCalendar = (CustomCalendar) findViewById(R.id.customCalendar);
        String[] arr = {"2019-02-10", "2019-02-11", "2019-02-15", "2019-02-16", "2019-02-25"};
        for (int i = 0; i < 5; i++) {
            int eventCount = 10;
            customCalendar.addAnEvent(arr[i], eventCount, getEventDataList(eventCount));
        }
    }

    public ArrayList<EventData> getEventDataList(int count) {
        ArrayList<EventData> eventDataList = new ArrayList();

        for (int i = 0; i < count; i++) {
            EventData dateData = new EventData();
            ArrayList<dataAboutDate> dataAboutDates = new ArrayList();

            dateData.setSection(CalendarUtils.getNAMES()[new Random().nextInt(CalendarUtils.getNAMES().length)]);
            dataAboutDate dataAboutDate = new dataAboutDate();

            int index = new Random().nextInt(CalendarUtils.getEVENTS().length);

            dataAboutDate.setTitle(CalendarUtils.getEVENTS()[index]);
            dataAboutDate.setSubject(CalendarUtils.getEventsDescription()[index]);
            dataAboutDates.add(dataAboutDate);

            dateData.setData(dataAboutDates);
            eventDataList.add(dateData);
        }

        return eventDataList;
    }

}
