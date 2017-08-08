require_relative 'extraction'
require_relative 'db_extractor'

class DBExtraction < Extraction

  attr_accessor :file

  def initialize (file)
    @file = file
  end

  def callCorrectExtraction
    __________________ # <<3
  end

end