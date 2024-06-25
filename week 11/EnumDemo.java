enum WeekDay{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
}
public class EnumDemo{
    public static void main(String args[]){
        WeekDay day = WeekDay.Friday;
        System.out.println("Today is "+day);
        System.out.println("\n All weekdays: ");
        for(WeekDay d:WeekDay.values())
            System.out.println(d);
    }
}