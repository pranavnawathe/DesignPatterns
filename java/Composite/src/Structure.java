package exercise;
import java.util.ArrayList;
import java.util.List;

// Collection/group of blocks
public class Structure ____________________ //>1 {
	// Collection of child group.
	private List<Group> groupList = new ArrayList<Group>();

	// assemble method should treat both single and group of blocks same.
	public void assemble() {
		
		for (Group group : groupList) {
			____________________ //>2
		}
		System.out.println("Creating a structure from Group objects.");
	}

	// Adds the group to the structure.
	public void add(Group group) {
		(groupList).add(group);
	}

	// Removes the group from the structure.
	public void remove(Group group) {
		(groupList).remove(group);
	}
}