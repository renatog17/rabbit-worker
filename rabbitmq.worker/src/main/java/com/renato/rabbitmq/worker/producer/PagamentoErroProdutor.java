package com.renato.rabbitmq.worker.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagamentoErroProdutor {

	@Autowired
	private AmqpTemplate amqpTemplate;
	
	public void gerarResposta(String menssagem) {
		amqpTemplate.convertAndSend("pagamento-response-erro-exchange",
				"pagamento-response-erro-rout-key",
				menssagem);
	}
}