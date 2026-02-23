package com.aditya.csejenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CseaddTest {
  Cseadd c = new Cseadd();
  
@Test	
void csetest() {
	int result = c.add(2, 3);
	assertEquals(5,result);
	}
@Test	
void csetest1() {
	int result = c.mul(2, 3);
	assertEquals(6,result);
	}
}
