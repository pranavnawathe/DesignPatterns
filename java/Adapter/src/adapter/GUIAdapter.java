package adapter;

public class GUIAdapter {
	WindowsGUI winGUI;
	LinuxGUI linuxGUI;
	MacGUI macGUI;

	boolean isWindows;
	boolean isLinux;

	public GUIAdapter(String operatingSystem) {
		if (operatingSystem.contains("Windows")) {
			winGUI = new WindowsGUI();
			isWindows = true;
		} else if (operatingSystem.contains("Linux")) {
			linuxGUI = new LinuxGUI();
			isLinux = true;
		} else {
			macGUI = new MacGUI();
		}

	}

	public void display() {
		if (isWindows) {
			winGUI.________(); // > 1
		} else if (isLinux) {
			linuxGUI._______(); // > 2
		} else {
			macGUI.______(); // > 3
		}
	}
}
