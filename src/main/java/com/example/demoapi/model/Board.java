package com.example.demoapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * Board
 */
@Data
@Entity
@Table(name = "board")
public class Board {
    @Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	
	@Column
	private String title;
	
	@Column
	private String contents;
	
	@Column(name = "write_name")
	private String writeName;
	
	@Column(name = "write_date")
	private LocalDateTime writeDate;	 
	
	@Column(name = "modify_name")
	private String modifyName;

	@Column(name = "write_id")	
	private String writeId;
	
	@Column(name = "modify_id")
	private String modifyId;

	@Column(name = "modify_date")
	private LocalDateTime  modifyDate;
}
