package com.LSUtigers3131.mod.items;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.Item;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	// Put in added items here to be register 
	public static final Item THICK_STEAK = new ItemThickSteak();
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item BASKETBALL = new ItemBase("basketball");
	public static final Item BALLPUMP = new ItemBase("ballpump");
}
