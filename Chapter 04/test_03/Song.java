package test_03;

public class Song {
	String title;
	String artist;
	int year;
	String country;

	public Song() {
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(year + "�� " + country +"������ " + artist +"�� �θ� "+ title);
	}
	
	public static void main(String[] args) {
		Song mysong = new Song("Dancing Queen", "ABBA", 1978, "������");
		mysong.show();
	}

}
