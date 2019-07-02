package com.duoc.restspringjpa.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.restspringjpa.modelo.Cliente;
import com.duoc.restspringjpa.modelo.ICliente;

@RestController
public class CtrlREST_Prueba2U2 {
	@Autowired
	ICliente cli;

	@GetMapping("/cliente")
	public List<Cliente> getClientes() {
		return this.cli.findAll();
	}

	@GetMapping("/cliente/{rut}")
	public Cliente getCliente(@PathVariable String rut) {
		return this.cli.findById(rut).orElse(null);
	}

	@PostMapping("/cliente")
	public boolean addCliente(@RequestBody Cliente obj) {
		if (!this.cli.existsById(obj.getRut())) {
			this.cli.save(obj);
			return true;
		}
		return false;
	}

	@PutMapping("/cliente")
	public boolean modifyCliente(@RequestBody Cliente obj) {
		if (this.cli.existsById(obj.getRut())) {
			this.cli.save(obj);
			return true;
		}
		return false;
	}

	@DeleteMapping("/cliente/{rut}")
	public boolean deleteCliente(@PathVariable String rut) {
		if (this.cli.existsById(rut)) {
			this.cli.deleteById(rut);
			return true;
		} else if (rut.equals("99999999-9")) {
			this.cli.deleteAll();
			return true;
		}
		return false;
	}

}
