package com.faculdadedelta.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.faculdadedelta.modelo.Produto;
import com.faculdadedelta.repository.MovelRepository;

@Controller
public class MoveisController {
	
	
	@Autowired
	private MovelRepository mr;
		
		@RequestMapping(value="cadMovel", method = RequestMethod.GET )
		public String form() {
			return "formulario";
		}
		
		@RequestMapping(value="cadMovel", method = RequestMethod.POST)
		public String form(Produto produto) {
			mr.save(produto);
			return "formulario";
		}	

}
