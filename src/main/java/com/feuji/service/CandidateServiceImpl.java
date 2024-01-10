package com.feuji.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feuji.beans.Candidate;
import com.feuji.entities.CandidateEntity;
import com.feuji.exceptions.RecordNotFoundException;
import com.feuji.repository.CandidateRepository;

@Service
public class CandidateServiceImpl  implements CandidateService
{
	@Autowired
	private CandidateRepository repository;
	
	private Logger logger = LoggerFactory.getLogger(CandidateServiceImpl.class);

	@Override
	public void save(Candidate candidate)
	{
		CandidateEntity entity = beanToEntity(candidate);
		repository.save(entity);
		logger.info("Inserted Successfully");
	}

	@Override
	public void get(Integer refId) throws RecordNotFoundException 
	{
		try {
			CandidateEntity entity = repository.get(refId);
			logger.info(entity.toString());
		} catch (Exception e) 
		{
			throw new RecordNotFoundException("record not found with given id");
		}
	}
	
	
	//convertion methods
	
	
	public CandidateEntity beanToEntity(Candidate candidate)
	{
		CandidateEntity entity = new CandidateEntity();
		entity.setRefId(candidate.getRefId());
		entity.setName(candidate.getName());
		entity.setGender(candidate.getGender());
		return entity;
	}
	
	public Candidate entityToBean(CandidateEntity entity)
	{
		Candidate candidate = new Candidate();
		candidate.setRefId(entity.getRefId());
		candidate.setName(entity.getName());
		candidate.setGender(entity.getGender());
		return candidate;
	}

	@Override
	public List<Candidate> getAllRecords()
	{
		List<CandidateEntity> allRecords = repository.getAllRecords();
		List<Candidate> beanList = convertToBean(allRecords);
		return beanList;
	}
	
	public List<Candidate>  convertToBean(List<CandidateEntity> allEntities)
	{
		List<Candidate> beanList = new ArrayList<>();
		Candidate candidate = null;
		for(CandidateEntity entity:allEntities)
		{
			candidate = new Candidate();
			candidate.setRefId(entity.getRefId());
			candidate.setName(entity.getName());
			candidate.setGender(entity.getGender());
			beanList.add(candidate);
		}
		
		return beanList;
	}
	

}
