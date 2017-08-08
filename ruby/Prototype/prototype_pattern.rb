require_relative 'car'
require_relative 'prototype_factory'

baseCar = Car.new
baseCar.name = 'Focus S'
baseCar.printDetails

print "\n"
prototypeFactory = PrototypeFactory.new
otherVersion  = prototypeFactory.____________; # << 1
otherVersion.name = 'Focus SE'
otherVersion.automaticClimateControl = true
otherVersion.cruiseControl = true
otherVersion.printDetails
           
