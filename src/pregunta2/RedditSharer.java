package pregunta2;

public abstract class RedditSharer implements Sharing {

	protected Sharer sharer;
	
	public RedditSharer() {
		// TODO Auto-generated constructor stub
		sharer = new Sharer();
	}
	
	@Override
	public void share(String message) {
		sharer.share(message, SharerType.Reddit);
	}

	
}
