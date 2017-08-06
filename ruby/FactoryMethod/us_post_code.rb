require_relative 'postcode'

class USPostCode < PostCode
  def initialize(post_code)
    if _________(post_code) #> 4
      @post_code = post_code
    else
      raise 'Invalid post code'
    end

    puts "Creating a instance of USPostCode #{post_code}"
  end

  def _________(post_code) #> 5
    (post_code =~ /^[0-9]{5}(?:-[0-9]{4})?$/)
  end
end