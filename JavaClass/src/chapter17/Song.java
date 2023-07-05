package chapter17;

class Song implements Comparable <Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    public int compareTo(Song s){
        return title.compareTo(s.getTitle());
    }


    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }
    public boolean equals(Object aSong) {
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }

    public int hashCode() {
        return title.hashCode();
    }


    public String getArtist()
    {
        return artist;
    }

    public String getBpm()
    {
        return bpm;
    }

    public String getRating()
    {
        return rating;
    }

    public String getTitle()
    {
        return title;
    }

    public String toString() {
        return title;
    }

}