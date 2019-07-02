package com.duoc.restspringjpa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ClienteAddClienteTest.class, ClienteDeleteClienteTest.class, ClienteGetClientesTest.class,
		ClienteGetClienteTest.class, ClienteModifyClienteTest.class })
public class AllTests {

}
