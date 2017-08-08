require_relative 'extraction'

class ExtractingTool
  attr_accessor :extraction

  def setExtraction extraction
    @extraction = __________________ # <<4
  end

  def startExtraction
    __________________.callCorrectExtraction # <<5
  end
end