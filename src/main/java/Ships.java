public enum Ships {
    Destroyer(4, 1), Cruiser(3, 2), Submarine(2, 3), Battleship(1, 4);

    int amount;
    int length;

    Ships(int amount, int length) {
        this.amount = amount;
        this.length = length;
    }
}
