package pl.karnas;

enum GibbetPartsEnum {

    GROUND(1, "-------------\n"),
    GIBBET_BASE(2, "   /\\\n"),
    LEGS(3, "   |   / \\\n"),
    BODY(4, "   |    |\n"),
    HANDS(5, "   |   /|\\\n"),
    HEAD(6, "   |    O\n"),
    ROPE(7, "   |/   |\n"),
    GIBBET_TOP(8, "    ______\n");

    private final int index;
    private final String gibbetPrintout;

    GibbetPartsEnum(int index, String gibbetPrintout) {
        this.index = index;
        this.gibbetPrintout = gibbetPrintout;
    }

    @Override
    public String toString() {
        return gibbetPrintout;
    }

}
