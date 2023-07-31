public class App {
    public static void main(String[] args) throws Exception {
        Calendar calendar = new Calendar();

        calendar.getAllHolidays();
        calendar.searchHolidayInCalendar("21/02/2023");
        calendar.searchHolidayInCalendar("21/11/2023");
    }
}
