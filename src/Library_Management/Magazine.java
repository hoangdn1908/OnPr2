package Library_Management;

import javax.sql.rowset.serial.SerialStruct;
import java.lang.management.MemoryManagerMXBean;

public class Magazine extends LibraryItem<String>{
    private int issueNumber;
    private String month;

    public Magazine(String id, String title, int issueNumber, String month)
    {
        super(id, title);
        this.issueNumber = issueNumber;
        this.month =  month;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String getInfo() {
        return "[Magazine] ID: " + getId()
                + " | Title: " + getTitle()
                + " | Issue: #" + issueNumber
                + " | Month: " + month;
    }
}

