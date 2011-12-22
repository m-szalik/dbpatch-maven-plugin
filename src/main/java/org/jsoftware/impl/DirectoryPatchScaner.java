package org.jsoftware.impl;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.jsoftware.config.Patch;

public class DirectoryPatchScaner extends SimplePatchScaner implements Serializable {
	private static final long serialVersionUID = 2156150612939870399L;

	@Override
	protected void sortAll(List<Patch> allPatchList) {
	}

	@Override
	protected void sortDirectory(List<Patch> dirPatchList) {
		Collections.sort(dirPatchList, new Comparator<Patch>() {
			public int compare(Patch o1, Patch o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
	}

}
