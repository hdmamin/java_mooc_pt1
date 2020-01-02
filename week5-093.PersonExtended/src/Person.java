import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    private Calendar calendar;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
        this.calendar = Calendar.getInstance();
    }

    public Person(String name, MyDate date) {
        this.name = name;
        this.birthday = date;
        this.calendar = Calendar.getInstance();
    }

    public Person(String name) {
        this.name = name;
        this.calendar = Calendar.getInstance();
        this.birthday = new MyDate(this.calendar.get(Calendar.DATE), 
                                   this.calendar.get(Calendar.MONTH)+1, 
                                   this.calendar.get(Calendar.YEAR));
    }
    
    
    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        int day = this.calendar.get(Calendar.DATE);
        int month = this.calendar.get(Calendar.MONTH) + 1;
        int year = this.calendar.get(Calendar.YEAR);
        MyDate newDate = new MyDate(day, month, year);
        return this.birthday.differenceInYears(newDate);
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return this.birthday.earlier(compared.birthday);
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
