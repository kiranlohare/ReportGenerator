package com.tcs.sbi.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class SecondTerm {
	@Column
	private Float marathi;
	@Column
	private Float hindi;
	@Column
	private Float english;
	@Column
	private Float socialScience;
	@Column
	private Float science;
	@Column
	private Float maths;
	@Column
	private Float physics;
	@Column
	private Float chemistry;
	
	public float getMarathi() {
		return marathi;
	}
	public void setMarathi(float marathi) {
		this.marathi = marathi;
	}
	public float getHindi() {
		return hindi;
	}
	public void setHindi(float hindi) {
		this.hindi = hindi;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getSocialScience() {
		return socialScience;
	}
	public void setSocialScience(float socialScience) {
		this.socialScience = socialScience;
	}
	public float getScience() {
		return science;
	}
	public void setScience(float science) {
		this.science = science;
	}
	public float getMaths() {
		return maths;
	}
	public void setMaths(float maths) {
		this.maths = maths;
	}
	public float getPhysics() {
		return physics;
	}
	public void setPhysics(float physics) {
		this.physics = physics;
	}
	public float getChemistry() {
		return chemistry;
	}
	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}
}
