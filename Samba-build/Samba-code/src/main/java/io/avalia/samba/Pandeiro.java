package io.avalia.samba;

public class Pandeiro implements IInstrument {

	@Override
	public String play() {
		return "pampam";
	}

	@Override
	public int getSoundVolume() {
		return 6;
	}

	@Override
	public String getColor() {
		return "white";
	}

}
