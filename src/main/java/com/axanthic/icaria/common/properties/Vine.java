package com.axanthic.icaria.common.properties;

import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.util.StringRepresentable;

@MethodsReturnNonnullByDefault

public enum Vine implements StringRepresentable {
	NONE("none"),
	BLOOMING("blooming"),
	RIPE("ripe"),
	GROWING("growing"),
	DEAD("dead"),
	VINE("vine");

	public final String name;

	Vine(String pName) {
		this.name = pName;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public String getSerializedName() {
		return this.name;
	}
}
