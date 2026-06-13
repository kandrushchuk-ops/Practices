package by.practice5_2;


public class Table<I, C extends Pers> {
    private I invNumber;
    private C character;

    public Table(I invNumber) {
        this.invNumber = invNumber;
    }

    public Table(I invNumber, C character) {
        this.invNumber = invNumber;
        this.character = character;
    }


    public I getInvNumber() {
        return invNumber;
    }

    public void setInvNumber(I invNumber) {
        this.invNumber = invNumber;
    }

    public C getCharacter() {
        return character;
    }

    public void setCharacter(C character) {
        this.character = character;
    }


    public void printCharacterName() {
        if (character != null) {
            System.out.println("За столом №" + invNumber + " сидит: " + character.getName());
        } else {
            System.out.println("За столом №" + invNumber + " никто не сидит");
        }
    }

    @Override
    public String toString() {
        return "Стол{инвентарный номер=" + invNumber + ", персонаж=" + character + "}";
    }
}
