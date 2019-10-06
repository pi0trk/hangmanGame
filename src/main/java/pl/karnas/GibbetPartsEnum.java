package pl.karnas;

enum GibbetPartsEnum {

    GROUND("-------------\n"),
    GIBBET_BASE("   /\\\n"),
    LEGS("   |   / \\\n"),
    BODY("   |    |\n"),
    HANDS("   |   /|\\\n"),
    HEAD("   |    O\n"),
    ROPE("   |/   |\n"),
    GIBBET_TOP("    ______\n");

    private final String gibbetPrintout;

    GibbetPartsEnum(String gibbetPrintout) {
        this.gibbetPrintout = gibbetPrintout;
    }

    @Override
    public String toString() {
        return gibbetPrintout;
    }

}
