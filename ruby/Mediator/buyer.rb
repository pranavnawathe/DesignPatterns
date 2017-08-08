

class Buyer
  attr_accessor :mediator
  attr_accessor :currency

  def initialize(mediator,currency)
    @mediator = mediator
    @currency = currency
    mediator.____________(____________) # <<1 <<2
  end

  def attemptToPurchase(bid)
    print "Buyer attempting a bid of #{currency} #{bid}.\n"
    return mediator.____________(____________, currency) # <<3 <<4
  end
end