package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String s = "";

        switch (monthNumber) {
            case 1, 2, 12:
                s = "Winter";
                break;
            case 3, 4, 5:
                s = "Spring";
                break;
            case 6, 7, 8:
                s = "Summer";
                break;
            case 9, 10, 11:
                s = "Autumn";
                break;
            default:
                s = "Wrong month number";
                break;
        }
        System.out.println(s);
    }
}
