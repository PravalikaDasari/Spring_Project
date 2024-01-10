package com.feuji.service;

import java.util.List;

import com.feuji.beans.Candidate;
import com.feuji.exceptions.RecordNotFoundException;

public interface CandidateService
{
	void save(Candidate candidate);
	void get(Integer refId) throws RecordNotFoundException;
	List<Candidate> getAllRecords();
}
