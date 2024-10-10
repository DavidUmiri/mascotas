package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mascota;
import com.example.demo.repository.MascotaRepository;

@Service
public class MascotaService {

	@Autowired
	private MascotaRepository mascotaRepository;

	public List<Mascota> getAllMascotas() {
		return mascotaRepository.findAll();
	}

	public Mascota saveMascota(Mascota mascota) {
		return mascotaRepository.save(mascota);
	}

}
