package com.tcs.sbi.main.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String name;
	
	@Column
	private String standard;
	
	@OneToOne(targetEntity = FirstTerm.class,cascade = CascadeType.ALL)
	private FirstTerm firstTerm;
	
	@OneToOne(targetEntity = SecondTerm.class,cascade = CascadeType.ALL)
	private SecondTerm secondTerm;
	
	@OneToOne(targetEntity = FinalTerm.class,cascade = CascadeType.ALL)
	private FinalTerm finalTerm;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public FirstTerm getFirstTerm() {
		return firstTerm;
	}
	public void setFirstTerm(FirstTerm firstTerm) {
		this.firstTerm = firstTerm;
	}
	public SecondTerm getSecondTerm() {
		return secondTerm;
	}
	public void setSecondTerm(SecondTerm secondTerm) {
		this.secondTerm = secondTerm;
	}
	public FinalTerm getFinalTerm() {
		return finalTerm;
	}
	public void setFinalTerm(FinalTerm finalTerm) {
		this.finalTerm = finalTerm;
	}
}