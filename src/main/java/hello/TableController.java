package hello;


import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TableController {

		@Resource
		CustomerRepository customerRepo;
		
		@RequestMapping(value = "customers")
		public String getAllReviews(Model model) {
			model.addAttribute("customer",customerRepo.findAll());
			return "customers";
		}

}
