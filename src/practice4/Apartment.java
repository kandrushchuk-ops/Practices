package practice4;

public class Apartment extends CivilBuilding {
    private int numOfApartments;

    public Apartment(int numOfApartments, int floors, String appointment, String street, String wall, int year) {
        super(floors, appointment, street, wall, year);
        this.numOfApartments = numOfApartments;
    }

}
