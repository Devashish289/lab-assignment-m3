package com.sunsoft.dao;

import java.util.List;

import com.sunsoft.entities.Trainee;



public interface TraineeDAO {
    public void save(Trainee t);
    public Trainee findById(Integer id);
    public List<Trainee> findAll();
	public void delete(Integer id);
	public void modify(Trainee t);
}
