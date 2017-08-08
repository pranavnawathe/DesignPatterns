require_relative 'expression'

class SubtractExpression < __________________ #5
  attr_accessor :leftExpression
  attr_accessor :rightExpression

  def initialize(left, right)
    @leftExpression = left
    @rightExpression = right
  end

  # interpret each number and subtract them
  def interpret
    return __________________ #6
  end
end