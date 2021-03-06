require_relative 'windows_gui'
require_relative 'mac_gui'
require_relative 'linux_gui'

class GUIAdapter
  def initialize(operating_system)
   @os = operating_system

   if operating_system.include? "windows"
     @windows = WindowsGUI.new
   elsif operating_system.include? "linux"
     @linux = LinuxGUI.new
   elsif operating_system.include? "Mac"
     @mac = MacGUI.new
   end
  end

  def display
    if @os.include? "windows"
      @windows._____ # >> 1
    elsif @os.include? "linux"
      @linux._____ # >> 2
    elsif @os.include? "Mac"
      @mac._______ # >> 3
    end
  end

end