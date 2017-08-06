require_relative 'car_db'

class Car
  public
      attr_accessor :name
      attr_accessor :engineCapacity
      attr_accessor :noOfSeats
      attr_accessor :horsePower
      attr_accessor :cruiseControl
      attr_accessor :automaticClimateControl

  def initialize
    @cruiseControl = false
    @automaticClimateControl = false
    carDB = CarDB.new
    @engineCapacity = carDB.engineCapacity
    @noOfSeats = carDB.noOfSeats
    @horsePower = carDB.noOfSeats
    print "\nCreating car object..";
  end

  def printDetails
    print "\nName: #{@name} \nEngine Capacity: #{@engineCapacity} \nNumber of seats: #{@noOfSeats}
    \nHorse Power: #{@horsePower} \nCruise Control: #{@cruiseControl}
    \nAutomatic Climate Control: #{@automaticClimateControl}"
  end
end