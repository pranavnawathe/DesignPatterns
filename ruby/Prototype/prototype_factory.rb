class PrototypeFactory
  def getCloneOfObject(cloneableObj)
    print "\nCloning " + cloneableObj.class.to_s + ' object..'
    return cloneableObj.clone
  end
end