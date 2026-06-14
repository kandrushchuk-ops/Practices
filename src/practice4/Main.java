package practice4;

public class Main {
    public static void main(String[] args) {
        Administrative sportBuilding = new Administrative("спортивная", 50, 30, "спортивный", "спортивная", "кирпич", 2010);
        int result = sportBuilding.getNumberOfPeople();
        System.out.println(result);
        sportBuilding.setNumberOfPeople(40);
        System.out.println(sportBuilding.getNumberOfPeople());

        Fabric fabricBuild = new Fabric(1000, "clothes", "fabric", "street", "wall", 2010);
        Building buildings[] = new Building[2];
        buildings[0] = sportBuilding;
        buildings[1] = fabricBuild;

        Village vehicles = new Village(buildings);

    }

}
