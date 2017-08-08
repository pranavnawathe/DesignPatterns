require_relative 'dark_theme'
require_relative 'light_theme'
require_relative 'editor'
require_relative 'terminal'

darkTheme =  DarkTheme.new
lightTheme = LightTheme.new

editor = Editor.new
editor.______(darkTheme) #>> 1
terminal = Terminal.new
terminal.______(lightTheme) #>> 2