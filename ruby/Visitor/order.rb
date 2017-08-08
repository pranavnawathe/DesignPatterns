require_relative 'visitable'
require_relative 'visitor'

class Order < _______________ # <<5
  attr_accessor :name
  def initialize(name)
    @name = name
    @items = Array.new
  end

  def accept(visitor)
    visitor._______________(self) # <<6
  end

  def addItem(item)
    @items.insert(item)
  end
end