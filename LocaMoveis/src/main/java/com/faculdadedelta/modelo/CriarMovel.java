package com.faculdadedelta.modelo;

import com.faculdadedelta.generico.EnumTipoMovel;
import com.faculdadedelta.generico.Movel;


public class CriarMovel {
	
	
	public Movel criarMovel(EnumTipoMovel tipo) {
		
		if(tipo == EnumTipoMovel.CADEIRA) {
			return new Cadeira();
		}else if (tipo == EnumTipoMovel.MESA) {
			return new Mesa();
			
		}else {
			return new Armario();
		}
		
	}

}
