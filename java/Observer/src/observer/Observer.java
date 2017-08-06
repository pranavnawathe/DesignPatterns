package observer;

public abstract class Observer {
	BreakingNewsFeed breakingNewsFeed;
	
	public Observer(BreakingNewsFeed breakingNewsFeed) {
		this.breakingNewsFeed = breakingNewsFeed;
		breakingNewsFeed._________(this); // > 3
	}
	
	public abstract void sendNotification();
}
