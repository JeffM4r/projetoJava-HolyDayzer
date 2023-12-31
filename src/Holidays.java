public class Holidays {
  private String[] holidayDates = new String[] { "01/01/2023",
      "21/02/2023",
      "17/04/2023",
      "21/04/2023",
      "01/05/2023",
      "08/06/2023",
      "07/09/2023",
      "12/10/2023",
      "02/11/2023",
      "15/11/2023",
      "25/12/2023" };
  private String[] holidayNames = new String[] { "Confraternização mundial",
      "Carnaval",
      "Páscoa",
      "Tiradentes",
      "Dia do trabalho",
      "Corpus Christi",
      "Independência do Brasil",
      "Nossa Senhora Aparecida",
      "Finados",
      "Proclamação da República",
      "Natal" };

  public String[] getHolidayDates() {
    return holidayDates;
  }

  public String[] getHolidayNames() {
    return holidayNames;
  }

  public void getAllHolidays() {
    for (int i = 0; i < this.holidayDates.length; i++) {
      System.out.println(this.holidayDates[i] + " => " + this.holidayNames[i]);
    }
  }
}
