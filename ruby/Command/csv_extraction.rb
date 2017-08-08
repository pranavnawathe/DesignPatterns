require_relative 'extraction'
require_relative 'csv_extractor'

class CSVExtraction < Extraction

  attr_accessor :file

  def initialize (file)
    @file = file;
  end

  def callCorrectExtraction
    __________________ # <<1
  end

end