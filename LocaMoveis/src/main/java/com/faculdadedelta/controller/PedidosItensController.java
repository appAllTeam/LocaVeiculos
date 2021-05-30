package com.faculdadedelta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.faculdadedelta.modelo.PedidoItens;
import com.faculdadedelta.repository.PedidoItensRepository;

@Controller
public class PedidosItensController {
	
	@Autowired
	private PedidoItensRepository pr;
		
		@RequestMapping(value="alugarMovel", method = RequestMethod.GET )
		public String form() {
			return "alugarMovel";
		}
		
		@RequestMapping(value="alugarMovel", method = RequestMethod.POST)
		public String form(PedidoItens pedidoItens) {
			
			pr.save(pedidoItens);
			return "alugarMovel";
		}

}
