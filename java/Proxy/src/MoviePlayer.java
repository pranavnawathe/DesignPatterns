package exercise;


// this class acts as Proxy
class MoviePlayer ________________ //>> 1 {

	Movie movie;
	String name;

	public MoviePlayer(String name) {
		super();
		movie = new Movie(name);
	}

	public void playMovie() {
		________________ //>> 2
	}

	public String getMovieDetails() {
		return movie.getMovieDetails();
	}
	
	public void deleteMovie(String movieName) {
		System.out.println("Permission denied!!");
	}
}