require_relative 'abstract_factory'

phone_factory = AbstractFactory.get_factory(______) #> 1
phone_factory.get_instance('UK','+44 7836 191 191') #> 2

post_code_factory = AbstractFactory.get_factory(_______) #> 3
post_code_factory._______('UK', "SW15 5PU") #> 4
post_code_factory.______('US','27606')