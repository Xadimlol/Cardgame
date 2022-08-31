public enum CardColours {
    club,
    diamond,
    heart,
    spade;

    public static CardColours colourFromInteger(int x) {
        switch (x) {
            case 0:
                return club;

            case 1:
                return diamond;

            case 2:
                return heart;
            case 3:
                return spade;
        }
        return null;
    }
}



