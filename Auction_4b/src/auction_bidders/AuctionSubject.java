package auction_bidders;

public interface AuctionSubject {
	void attach(BidderObserver observer);
	void detach(BidderObserver observer);
	void notifyObservers(String event);

}
