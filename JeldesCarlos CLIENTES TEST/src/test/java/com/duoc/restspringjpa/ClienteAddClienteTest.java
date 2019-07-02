package com.duoc.restspringjpa;

import static org.junit.Assert.assertTrue;

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
public class ClienteAddClienteTest {
	@Autowired
	TestEntityManager em;
	@Autowired
	ICliente x;

	@Before
	public void setUp() throws Exception {
		this.em.persist(new Cliente("1-9", "Juan", "Juanes", "zxc@asd.cl", "1234123"));
		this.em.persist(new Cliente("2-7", "Ana", "Perez", "ert@asd.cl", "1234123"));
		this.em.persist(new Cliente("3-5", "Maria", "Esponja", "ghj@asd.cl", "1234123"));
		this.em.persist(new Cliente("4-3", "Jose", "PantalonAncho", "bvn@asd.cl", "1234123"));
		this.em.persist(new Cliente("5-1", "Cesar", "Gonzalez", "iuoi@asd.cl", "1234123"));
	}

	@Test
	public void cuandoaddClienteNoExistenteFindAllEntonces6() {
		this.x.save(new Cliente("6-9", "Romina", "Roman", "asd@asd.cl", "1234123"));
		assertTrue(this.x.findAll().size() == 6);
	}

}
