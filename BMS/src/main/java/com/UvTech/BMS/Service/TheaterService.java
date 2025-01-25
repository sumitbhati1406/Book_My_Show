package com.UvTech.BMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UvTech.BMS.Model.TheaterEntity;
import com.UvTech.BMS.Repo.TheaterRepo;

@Service
public class TheaterService {

	@Autowired
	private TheaterRepo theaterRepo;
	public String addTheater(TheaterEntity theater) {
		theaterRepo.save(theater);
		return "Added to db..";
	}
}
