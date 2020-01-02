
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate newDate) {
        MyDate earlier;
        MyDate later;
        if (this.earlier(newDate)) {
            earlier = this;
            later = newDate;
        } else {
            earlier = newDate;
            later = this;
        }
        
        // Don't count partial years (anything less than full 365 days).
        int diff = later.year - earlier.year;
        if (later.month < earlier.month || 
                (later.month == earlier.month && later.day < earlier.day)) {
            diff--;
        }
        return Math.abs(diff);
    }

  
}
