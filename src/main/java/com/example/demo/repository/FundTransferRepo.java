package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.FundTransfer;


	
	@Repository
	public interface FundTransferRepo extends JpaRepository<FundTransfer,Long>{
		
		@Query(value = "SELECT * FROM fundtransfer WHERE fromaccount = ?1 ", nativeQuery = true)
		  List<FundTransfer> findByaccno(Long fromaccount);

	}


