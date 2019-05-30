package com.yas.ghandour.restprofessor.cour;

import java.util.List;

import com.yas.ghandour.restprofessor.cour.Cour;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourRepository extends JpaRepository<Cour, String> {

	/*public List<Cour> findByProfessorNumId (String numId);*/
	//List<Cour> findByProfessorId(String Id);
}
