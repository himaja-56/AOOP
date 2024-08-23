package auction_bidders;
import java.util.*;

public class Auction implements AuctionSubject{
	private List<BidderObserver> observers = new ArrayList<>();

	@Override
	public void attach(BidderObserver observer) {
		observers.add(observer);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detach(BidderObserver observer) {
		observers.remove(observer);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers(String event) {
		for (BidderObserver observer:observers) {
			observer.update(event);
		}
		// TODO Auto-generated method stub
		
	}
	
	public void startAuction() {
		notifyObservers("Auction started");
	}
	
	public void endAuction() {
		notifyObservers("Auction ended");
	}

}
