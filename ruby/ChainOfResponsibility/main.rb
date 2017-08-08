require_relative 'configuration_support'
require_relative 'generic_support'
require_relative 'production_support'

generic_support = GenericSupport.new
configuration_support = ConfigurationSupport.new
production_support = ProductionSupport.new

generic_support._____(configuration_support) #> 1
configuration_support._____(production_support) #> 2

generic_support._______("Production") #> 3
generic_support.handle_request("Configuration")