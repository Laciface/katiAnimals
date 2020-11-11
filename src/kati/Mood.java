package kati;

public enum Mood {
    HAPPY (1, 2, 3),
    NORMAL (-1, -3, 3),
    BAD (-3, -5, -7);

    public final int Tlife;
    public final int Hlife;
    public final int Clife;

    Mood(int tlife, int hlife, int clife) {
        Tlife = tlife;
        Hlife = hlife;
        Clife = clife;
    }

    public int getTlife() {
        return Tlife;
    }

    public int getHlife() {
        return Hlife;
    }

    public int getClife() {
        return Clife;
    }


}



