public enum Ships {
    Destroyer(4), Cruiser(3), Submarine(2), Battleship(1);

    int amount;

    Ships(int amount) {
        this.amount = amount;
    }
}
