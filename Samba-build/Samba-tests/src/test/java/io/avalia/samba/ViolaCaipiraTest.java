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
public class ViolaCaipiraTest {

  @Test
  public void aViolaCaipiraShouldMakePlimPlom() {
    IInstrument violaCaipira = new ViolaCaipira();
    String sound = violaCaipira.play();
    Assert.assertEquals("plim plom", sound);
  }
  
  @Test
  public void aViolaCaipiraShouldBeYellow() {
	  IInstrument violaCaipira = new ViolaCaipira();
	  String color = violaCaipira.getColor();
	  Assert.assertEquals("yellow", color);
  }
  
  @Test
  public void aViolaCaipiraShouldHaveSoundVolume10() {
	  IInstrument violaCaipira = new ViolaCaipira();
	  int volume = violaCaipira.getSoundVolume();
	  Assert.assertEquals(10, volume);
  }
	
}
