package com.pog.count.Controller;

import com.pog.count.DTO.ListaDTO;
import com.pog.count.Entity.Recibo;
import com.pog.count.Service.ReciboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/api")
public class ReciboController {


    @Autowired
    private ReciboService reciboService;

    @GetMapping("/calculo")
    public ResponseEntity<?> calcular(@RequestBody final ListaDTO lista){

        Recibo recibo = reciboService.calculo(lista.getNumeros());

        String msg = "Media : " + recibo.getMedia() + "\nMediana : " + recibo.getMediana() + "\nDesvio Padrao : " + recibo.getDesvioPadrao() + "\nQtd valores : " + recibo.getQtdRecebidos();
        return ResponseEntity.ok(msg);

    }
}
