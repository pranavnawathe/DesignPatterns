require_relative 'visitable'
require_relative 'visitor'
require_relative 'order'

class Customer < _______________ # <<1
  attr_accessor :name
  def initialize(name)
    @name = name
    @orders = Array.new
  end

  def accept(visitor)
    visitor._______________(self) #<<2
    for order in @orders
      order._______________(visitor) # <<3
    end
  end

  def add_order(order)
    @orders.push(order)
  end
end