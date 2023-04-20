package com.example.VisaAPI.model;

import java.sql.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class BasicModel {
	@NotEmpty(message = "ユーザー名を入力してください")
    private String username;
	
	
	@NotEmpty(message = "パスワードを入力してください")
    private String password;
	
	
	@NotEmpty(message = "名前を入力してください")
    private String name;
	
	
	@NotEmpty(message = "性別を選択してください")
    private String sex;
	
	
	@NotEmpty(message = "生年月日を選択してください")
	private String dateofbirth;
    private Date birthday;
	
	
	@NotEmpty(message = "在留カード番号を入力してください")
    private String visa_ID;
	
	

    private Date visa_date;
	
	@NotEmpty(message = "ビザ種類を選択してください")
    private String visa_type;
    
	@NotEmpty(message = "国籍を選択してください")
    private String country;
    
	@NotEmpty(message = "住所を入力してください")
    private String address;
    
    
	private String information;
	private List<String> errorList;
}
