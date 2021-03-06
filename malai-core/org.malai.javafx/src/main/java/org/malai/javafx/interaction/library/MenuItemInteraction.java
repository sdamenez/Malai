/*
 * This file is part of Malai.
 * Copyright (c) 2005-2017 Arnaud BLOUIN
 * Malai is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later version.
 * Malai is distributed without any warranty; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */
package org.malai.javafx.interaction.library;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.scene.control.MenuItem;
import org.malai.javafx.interaction.JfxInteractionImpl;

/**
 * A JavaFX interaction that uses a single menu item.
 * @author Arnaud BLOUIN
 */
public abstract class MenuItemInteraction<T extends MenuItem> extends JfxInteractionImpl {
	/** The widget used during the interaction. */
	protected T widget;
	protected final Set<MenuItem> registeredItems;

	/**
	 * Creates the interaction.
	 */
	public MenuItemInteraction() {
		super();
		registeredItems = new HashSet<>();
	}

	@Override
	public void reinit() {
		super.reinit();
		widget = null;
	}

	/**
	 * @return The widget used during the interaction.
	 */
	public T getWidget() {
		return widget;
	}

	public void registerToMenuItems(final List<MenuItem> widgets) {
		// Should be overriden.
		if(widgets != null) {
			registeredItems.addAll(widgets);
		}
	}
}
