package com.sun.dpMain.structuralPattern.flyweightPattern3;

import java.util.HashMap;
import java.util.Map;

public class ModelFactory {
	private static Map<String, Show> models = new HashMap<String, Show>();

	public static Show getShow(String name) {
		Model model = (Model) models.get(name);
		if (model == null) {
			model = new Model(name);
			models.put(name, model);
		}
		return model;
	}
}
