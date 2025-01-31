package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Mascota;
import com.example.demo.service.MascotaService;

@RestController
@RequestMapping("/api/mascotas")
public class MascotaController {

	@Autowired
	private MascotaService mascotaService;

	@GetMapping
	public List<Mascota> getAllMascotas() {
		return mascotaService.getAllMascotas();
	}

	@PostMapping
	public ResponseEntity<Mascota> createMascota(@RequestBody Mascota mascota) {
		return ResponseEntity.ok(mascotaService.saveMascota(mascota));
	}

}
