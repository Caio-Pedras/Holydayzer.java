public class Holiday {
    private String holidayName;
    private String date;

    public Holiday(String holidayName, String date) {
        setHolidayName(holidayName);
        setDate(date);
    }

    public String getHoliday() {
        return this.date + " => " + this.holidayName;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
