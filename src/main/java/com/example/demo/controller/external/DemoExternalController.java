package com.example.demo.controller.external;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Demo;
import com.example.demo.dto.DemoRequest;
import com.example.demo.dto.RequestSuccess;
import com.example.demo.exception.DemoException;
import com.example.demo.services.DemoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author Precious Pearl A. Sano Ventura <pr3_cious_15@yahoo.com>
 *
 */
@RestController
@RequestMapping("/external/")
@Transactional
@Tag(name = "Demo API Sample")
public class DemoExternalController {

	private final DemoService service;
	
	@Autowired
	public DemoExternalController(DemoService service) {
		this.service = service;
	}
	
	@GetMapping("/test")
	@Operation(summary = "TEST-LIST", description = "Get demo list by id")
	public ResponseEntity<List<Demo>> getDemoList(
			@RequestHeader(name = "x-api-login-id", required=false) String loginId) throws DemoException {
		return ResponseEntity.ok(service.getDemoList(loginId));
	}
	
	@PostMapping("/test")
	@Operation(summary = "TEST-NEW-SUBMISSION", description = "Submission new demo by ID")
	public ResponseEntity<RequestSuccess> submitDemo(
			@RequestHeader(name = "x-api-login-id", required=false) String loginId,
			@RequestBody DemoRequest request) throws DemoException {
		return ResponseEntity.ok(service.submitDemo(request));
	}
	
	@PatchMapping("/test")
	@Operation(summary = "TEST-UPDATE-SUBMISSION", description = "Submission update demo by ID")
	public ResponseEntity<RequestSuccess> updateDemoById(
			@RequestHeader(name = "x-api-login-id", required=false) String loginId) throws DemoException {
		return ResponseEntity.ok(service.updateDemoById(loginId));
	}
	
	@DeleteMapping("/test")
	@Operation(summary = "TEST-DELETE-SUBMISSION", description = "Submission delete demo by ID")
	public ResponseEntity<RequestSuccess> deleteDemoById(
			@RequestHeader(name = "x-api-login-id", required=false) String loginId) throws DemoException {
		return ResponseEntity.ok(service.deleteDemoById(loginId));
	}
}
