require_relative 'us_post_code'
require_relative 'uk_post_code'
require_relative 'in_post_code'

class PostCodeFactory
  def self.get_instance(country, postcode)
    if country == "US"
      return _____.new(postcode) # > 1
    elsif country == "UK"
      return _____.new(postcode) # > 2
    elsif country == "IN"
      return _____.new(postcode) # > 3
    end

    raise 'Country is not supported'
  end
end