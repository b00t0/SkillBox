import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int banknoteCount = 4001;
        System.out.println(MoneyCalculator.calculateCassetteCount(banknoteCount));

        UsageAnalytics analytics = new UsageAnalytics();
        analytics.countVisit();
        analytics.countVisit();
        int visits = analytics.countVisit();
        System.out.println("Total visits: " + visits);

        System.out.println(getPeriodFromJavaBirthday());


    }

    public static String getPeriodFromJavaBirthday() {
        LocalDate birthday = LocalDate.of(1995, 5, 23);
        Period period = birthday.until(LocalDate.now());
        return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
    }
}
