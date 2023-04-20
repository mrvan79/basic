package com.example.VisaAPI.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.VisaAPI.model.BasicModel;

@Mapper
public interface BasicMapper {
	int saveuser (BasicModel basicModel);

	List<BasicModel> getuser(BasicModel basicModel);

}
