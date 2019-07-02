package com.duoc.restspringjpa;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.duoc.restspringjpa.modelo.Cliente;
import com.duoc.restspringjpa.modelo.ICliente;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ClienteGetClientesTest {
	@Autowired
	TestEntityManager em;
	@Autowired
	ICliente x;

	@Before
	public void setUp() throws Exception {
		this.em.persist(new Cliente("1-9", "Juan", "Juanes", "Juan@asd.cl", "1234123"));
		this.em.persist(new Cliente("2-7", "Ana", "Perez", "Juan@asd.cl", "1234123"));
		this.em.persist(new Cliente("3-5", "Maria", "Esponja", "Juan@asd.cl", "1234123"));
		this.em.persist(new Cliente("4-3", "Jose", "PantalonAncho", "Juan@asd.cl", "1234123"));
		this.em.persist(new Cliente("5-1", "Cesar", "Gonzalez", "Juan@asd.cl", "1234123"));
	}

	@Test
	public void cuandogetClientesSntonces5() {
		assertTrue(this.x.findAll().size() == 5);
	}

}
