package com.example.VisaAPI.service;

import java.util.List;

import com.example.VisaAPI.model.BasicModel;

public interface BasicService {
	
	int saveuser (BasicModel basicModel);
	List<BasicModel> getuser(BasicModel basicModel);
}
