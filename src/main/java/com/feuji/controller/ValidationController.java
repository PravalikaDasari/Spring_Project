package com.feuji.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.feuji.beans.Candidate;
import com.feuji.exceptions.RecordNotFoundException;
import com.feuji.service.CandidateService;

@Controller
public class ValidationController
{
	@Autowired
	private CandidateService candidateService;
	
	private static Logger log = LoggerFactory
			.getLogger(ValidationController.class);
	
	@RequestMapping("/check")
	public String demo() {
		System.out.println("coming");
		return "Hello";
	}
	@RequestMapping(path = "/loginByValidator" , method = RequestMethod.GET)
	public ModelAndView createCandidate()
	{
		Map<String, String> map = new HashMap<>();

		System.err.println("creae() started");
		map.put("headername","Welcome to Feuji Solutions!");
		System.err.println("create() returning");
		return new ModelAndView("loginFormUsingValidator", "login", new com.feuji.beans.Candidate());
		
	}
	
	@RequestMapping(path = "/loginByValidator2" , method= RequestMethod.POST )
	public ModelAndView success(@Valid @ModelAttribute( name= "login") Candidate candidate,
			BindingResult bindingResult, ModelMap map ) 
	{
		System.err.println("success() started");
		log.info(candidate.toString());
		
		if(bindingResult.hasErrors())
		{		
			return new ModelAndView("loginFormUsingValidator","login",candidate);
		}
		else {
			candidateService.save(candidate);
			return new ModelAndView("loginSuccess");
		}	
	}
	
	@RequestMapping(path = "/getRecord", method = RequestMethod.GET)
	public ModelAndView getRecord(@RequestParam(value = "refId") Integer refId) throws RecordNotFoundException 
	{
		candidateService.get(refId);
		return new ModelAndView("loginSuccess");
	}
	
	@RequestMapping(path = "/getAllRecords" ,method =RequestMethod.GET)
	public ModelAndView getAllRecords(ModelMap map) 
	{
		List<Candidate> allRecords = candidateService.getAllRecords();
		map.put("headername", "All Candidates Details");
		map.put("allRecords",allRecords);
		return new ModelAndView("displayRecords");
	}
	
}
