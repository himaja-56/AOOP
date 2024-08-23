package auction_bidders;

public class AuctionSystem {

	public static void main(String[] args) {
		Auction auction = new Auction();
		Bidder bidder1 = new Bidder("Bidder 1");
		Bidder bidder2 = new Bidder("Bidder 2");
		
		auction.attach(bidder1);
		auction.attach(bidder2);
		
		AuctionTemplate standardAuction = new StandardAuction();
		standardAuction.conductAuction();
		
		auction.startAuction();
		auction.endAuction();
		// TODO Auto-generated method stub

	}

}
