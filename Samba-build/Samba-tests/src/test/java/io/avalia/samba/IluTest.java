package io.avalia.samba;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *       *** IMPORTANT WARNING : DO NOT EDIT THIS FILE ***
 * 
 * This file is used to specify what you have to implement. To check your work,
 * we will run our own copy of the automated tests. If you change this file,
 * then you will introduce a change of specification!!!
 * 
 * @author Olivier Liechti
 */
public class IluTest {

  @Test
  public void anIluShouldMakeBum() {
    IInstrument ilu = new Ilu();
    String sound = ilu.play();
    Assert.assertEquals("bum", sound);
  }
  
  @Test
  public void anIluShouldBeDarkYellow() {
    IInstrument ilu = new Ilu();
    String color = ilu.getColor();
    Assert.assertEquals("dark yellow", color);
  }
  
  @Test
  public void anIluShouldLouderThanATrumpetAndAFluteCombined() {
    IInstrument trumpet = new Trumpet();
    IInstrument flute = new Flute();
	IInstrument ilu = new Ilu();
    int trumpetVolume = trumpet.getSoundVolume();
    int fluteVolume = flute.getSoundVolume();
	int trumpetAndFluteVolumeCombined = fluteVolume + trumpetVolume;
	int iluVolume = ilu.getSoundVolume();
    Assert.assertTrue(iluVolume > trumpetAndFluteVolumeCombined);
  }
 
}