public class Calendar extends Holidays implements ICalendar {

  public void searchHolidayInCalendar(String date) {
    String[] holidayDates = super.getHolidayDates();
    String[] holidayNames = super.getHolidayNames();

    for (int i = 0; i < holidayDates.length; i++) {
      if (holidayDates[i].equals(date)) {
        System.out.println("O feriado da data enviada é: " + holidayNames[i]);
        return;
      }
    }

    System.out.println("Data enviada não tem feriado");
  }
}
