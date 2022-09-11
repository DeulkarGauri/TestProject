package com.custom.markerinterface;

public class ShapeDao implements Deletable {
	// We can write our delete() method so that only objects implementing our marker
	// interface can be deleted:
	public boolean Delete(Object object) {

		if ((object instanceof Deletable)) {
			return true;
		}

		return true;

	}
}
