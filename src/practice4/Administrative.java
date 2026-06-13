package practice4;

public class Administrative extends CivilBuilding {
    private String purpose;
    private int numberOfPeople;

    public Administrative(String purpose, int numberOfPeople, int fl, String appointment, String street, String wall, int year) {
        super(fl, appointment, street, wall, year);
        this.purpose = purpose;
        this.numberOfPeople = numberOfPeople;


    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

//    public int setNumberOfPeople(int newPeople) {
//        numberOfPeople = newPeople;
//        return numberOfPeople;
//
//    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;

    }

}
