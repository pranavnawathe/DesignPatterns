require_relative 'extracting_tool'
require_relative 'db_extraction'
require_relative 'csv_extraction'
require_relative 'tsv_extraction'

extractingTool = ExtractingTool.new
extractingTool.setExtraction(__________________) # <<6
extractingTool.startExtraction

extractingTool.setExtraction(__________________) # <<7
extractingTool.startExtraction()

extractingTool.setExtraction(__________________) # <<8
extractingTool.startExtraction()


=begin
Expected output is as follows:

Extracting as CSV...
Extracting as TSV...
Extracting as database...

=end