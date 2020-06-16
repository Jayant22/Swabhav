package com.techlab.Junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Junit {
   @Test
   public void testSetup() {
      String str= "I am done with Junit setup";
      assertEquals("I am done with Junit setup",str);
   }
}

