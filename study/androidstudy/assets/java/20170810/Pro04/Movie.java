package Pro04;

public class Movie {
	private String title;
	private String producer;
	private String productor;
	
	public Movie() {
		this(null, null, null);
	}
	public Movie(String title, String producer, String productor) {
		this.title=title;
		this.producer=producer;
		this.productor=productor;
	}
	
	public void setMovie(String title, String producer, String productor) {
		this.title=title;
		this.producer=producer;
		this.productor=productor;
	}
	public String getTitle() {
		return title;
	}
	public String getProducer() {
		return producer;
	}
	public String getProductor() {
		return productor;
	}
	public String toString() {
		return "제목: "+title+", 감독: "+productor+", 제작사: "+productor;
	}
}
