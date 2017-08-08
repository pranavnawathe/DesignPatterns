require_relative 'expression'

# compound expression
class AddExpression < __________________ # <<1
  attr_accessor :leftExpression
  attr_accessor :rightExpression

  def initialize(left, right)
    @leftExpression = left
    @rightExpression = right
  end

  # interpret each number and add them
  def interpret
    return __________________ # <<2
  end
end