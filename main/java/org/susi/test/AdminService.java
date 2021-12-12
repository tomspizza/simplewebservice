package org.susi.test;

import java.util.concurrent.atomic.AtomicBoolean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.susi.test.requests.AdminRequest;

@RestController
public class AdminService {


	AtomicBoolean lock = new AtomicBoolean(false);

	
	@GetMapping("/admin")
	public String admin() {
		return "im admin";
	}
	
	
	@PostMapping("/posttest")
	public String posttest(@RequestBody AdminRequest br) {
		String res = "";
		res = "posttest";
		return res;
	}

	
}
