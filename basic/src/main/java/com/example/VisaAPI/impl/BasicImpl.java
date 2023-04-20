package com.example.VisaAPI.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.VisaAPI.mapper.BasicMapper;
import com.example.VisaAPI.model.BasicModel;
import com.example.VisaAPI.service.BasicService;
@Service
public class BasicImpl implements BasicService{
	@Resource
	BasicMapper mapper;

	@Override
	public List<BasicModel> getuser(BasicModel basicModel) {
		return mapper.getuser(basicModel);
	}

	@Override
	public int saveuser(BasicModel basicModel) {
		return mapper.saveuser(basicModel);
	}
	
}
