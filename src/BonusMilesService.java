public class BonusMilesService {
    public int calculate(int prise) {
        int bonus = 20;
        int miles = prise / bonus;
        return miles;
    }
}
