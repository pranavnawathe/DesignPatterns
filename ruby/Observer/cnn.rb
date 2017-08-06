class CNN
  def initialize (breaking_news_feed)
    @breaking_news_feed = breaking_news_feed
    breaking_news_feed.________(self) # > 3
  end

  def sendNotification
    puts 'CNN Breaking News : ' +@breaking_news_feed.breaking_news
  end
end